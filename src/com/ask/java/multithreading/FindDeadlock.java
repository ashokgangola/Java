package com.ask.java.multithreading;

import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.util.Arrays;

public class FindDeadlock {

	public String findDeadlockInfo() {
		ThreadMXBean bean = ManagementFactory.getThreadMXBean();
		long[] threadIds = bean.findDeadlockedThreads(); // Returns null if no threads are deadlocked.
		StringBuilder sb = new StringBuilder();
		if (threadIds != null) {
			ThreadInfo[] infos = bean.getThreadInfo(threadIds);
			for (ThreadInfo info : infos) {
				StackTraceElement[] stack = info.getStackTrace();
				if (stack != null && stack.length > 0) {
					String a = Arrays.stream(info.getStackTrace()).skip(0).map(StackTraceElement::toString)
							.reduce((s1, s2) -> s1 + "\n" + s2).get();
					sb.append(a);
					// for(StackTraceElement element : stack) {
					// System.out.println(element);
					// }
				}
			}
		}
		return sb.toString();
	}
}
