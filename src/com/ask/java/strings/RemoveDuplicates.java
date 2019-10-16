package com.ask.java.strings;

public class RemoveDuplicates {

	public static void main(String[] args) {
		 String data = "HelloWorld_helloworld"; 
		 char[] array = data.toUpperCase().toCharArray();
		 String _array = removeRedundant(array);
		 System.out.println("String after duplicate removed = "+_array);
	}
	
	private static String removeRedundant(char[] array) {
		String _array = "";
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+"::"+_array.lastIndexOf(array[i]));
			if(_array.lastIndexOf(array[i]) == -1) {
				_array += array[i];
			}
		}
		return _array;
	}
}
