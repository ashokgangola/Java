package com.ask.java.collection;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(100,"2019-07-21");
	      map.put(103,"2019-07-20");
	      map.put(102,"2019-06-22");
	      map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);  
	}
}
