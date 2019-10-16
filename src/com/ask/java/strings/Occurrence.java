package com.ask.java.strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Occurrence {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("a");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("a");
		list.add("e");
		list.add("f");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for(String data : list) {
			Integer exist = map.get(data);
			map.put(data, (exist == null)? 1 : exist+1);
			/*if(exist == null) {
				map.put(data,1);
			} else {
				map.put(data, exist+1);
			}*/
		}
		
		System.out.println("Occurrence");
		
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" :: "+entry.getValue());
		}
	}
}
