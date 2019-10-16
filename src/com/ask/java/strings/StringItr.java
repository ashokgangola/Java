package com.ask.java.strings;

public class StringItr {

	public static void main(String[] args) {
		System.out.println("Output = \n"+foo("hello world"));
	}
	
	static String foo(String str) {
		if((str.isEmpty())) {
			return str;
		}
		
		char[] chars = str.toCharArray();
		int right = str.length()-1;
		for(int left=0;left<right;left++) {
			char swap = chars[left];
			chars[left] = chars[right];
			chars[right--]=swap;
		}
		String s = "";
		for(char c : chars) {
			s +=c;
		}
		return s;
	}
}
