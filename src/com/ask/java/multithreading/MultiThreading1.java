package com.ask.java.multithreading;

import java.lang.Thread.State;
import java.lang.management.ManagementFactory;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreading1 {
	
	public static void main(String[] args) {
		ExecutorService pool = Executors.newFixedThreadPool(2);
		int i = 1;
		boolean runThread = true;
		while (runThread) {
			System.out.println("Value of i = "+i);
			MultiThreadingDemo testThread = new MultiThreadingDemo(i, "Hello___" + i);
			//testThread.start();
			pool.execute(testThread);
			i++;
			State state = testThread.getState();
			try {
				synchronized (state) {
					System.out.println("Inside syncronized");
					if(i != 1) {
						state.wait(900);
						System.out.println("Wait completed for " + testThread.getId());
						System.out.println("Interrupting thread = " + testThread.getId());
						testThread.interrupt();
						long nanos = ManagementFactory.getThreadMXBean().getThreadCpuTime(testThread.getId());
						//double seconds = (double)nanos/1000000000.0;
						System.out.println("Total execution time in secods = "+nanos+" :: "+testThread.getId());
					}
					
				}
				long[] deadLockThread = ManagementFactory.getThreadMXBean().findDeadlockedThreads();
				if(deadLockThread != null && deadLockThread.length > 0) {
					for(long dt : deadLockThread) {
						System.out.println("Deadlock thread = "+dt);
					}
					
				} else {
					System.out.println("Deadlock thread not found");
				}
			} catch (InterruptedException e) {
				//e.printStackTrace();

			}
			if (i == 5)
				runThread = false;
			System.out.println("------------------------------------------------------");
		}
	}

}

class MultiThreadingDemo extends Thread {
	volatile int id;
	volatile String name;

	public MultiThreadingDemo(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("Running..." + Thread.currentThread().getId() + "::going to sleep = " + name);
		try {
			if(id == 1) {
				Thread.sleep(10000000);
			} else {
				Thread.sleep(1000);
			}
			
			System.out.println("waked up");
		} catch (InterruptedException e) {
			//e.printStackTrace();
		}
		//super.run();
	}

	@Override
	public void interrupt() {
		System.out.println("Interupting current my thread id = " + Thread.currentThread().getId());
		super.interrupt();
	}

	@Override
	public boolean isInterrupted() {
		// TODO Auto-generated method stub
		return super.isInterrupted();
	}

	@Override
	public StackTraceElement[] getStackTrace() {
		// TODO Auto-generated method stub
		return super.getStackTrace();
	}

	@Override
	public long getId() {
		// TODO Auto-generated method stub
		return super.getId();
	}

	@Override
	public State getState() {
		// TODO Auto-generated method stub
		return super.getState();
	}

	@Override
	public void setUncaughtExceptionHandler(UncaughtExceptionHandler eh) {
		// TODO Auto-generated method stub
		super.setUncaughtExceptionHandler(eh);
	}

}
