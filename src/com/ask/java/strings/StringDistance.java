package com.ask.java.strings;

public class StringDistance {

	public static void main(String[] args) {
		String s = "my name is garnar";
		int firstIndex = s.indexOf("a");
		int lastIndex = s.lastIndexOf("a");
		String sub = s.substring(firstIndex+1, lastIndex);
		System.out.println("Sub string = "+sub);
		sub = sub.replace("a", "");
		sub = sub.replace(" ", "");
		System.out.println("Distance = "+sub.length());
	}
}
