package com.ask.java.collection;

import java.util.LinkedList;
import java.util.List;

public class LinkedListReverse {

	public static void main(String[] args) {
		List<String> ll = getLinkedList();
		//ll.stream().forEach(System.out::println);
		ll.forEach(System.out::println);
		System.out.println("--------------------------------------");
		recursiveReverse(ll, ll.size()-1);
		
	}
	
	private static String recursiveReverse(List<String> ll, int index) {
		if(ll != null && ll.size() > 0 && index > -1) {
			System.out.println(ll.get(index));
			return recursiveReverse(ll, index-1);
		} else {
			return null;
		}
	}
	
	private static List<String> getLinkedList(){
		List<String> ll = new LinkedList<>();
		ll.add("Hello");
		ll.add("my");
		ll.add("name");
		ll.add("is");
		ll.add("Ashok");
		ll.add("Kumar");
		return ll;
	}
}
