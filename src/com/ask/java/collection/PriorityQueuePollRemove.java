package com.ask.java.collection;

import java.util.*;  

public class PriorityQueuePollRemove {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		  
		queue.add("Vijay Raj");  
		queue.add("JaiShankar");  
		queue.add("Raj");  
		queue.add("Amit Sharma");
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		} 
		System.out.println("---------------------------------");  
		
		String a = queue.remove();  
		System.out.println("Removed element = "+a);
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek()); 
		Iterator<String> itrt=queue.iterator();  
		while(itrt.hasNext()){  
		System.out.println(itrt.next());  
		} 
		System.out.println("---------------------------------");  
		String b = queue.poll();  
		System.out.println("polled element = "+b);
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek()); 
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		} 
	}

}



