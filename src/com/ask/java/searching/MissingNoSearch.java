package com.ask.java.searching;

import java.util.Random;

public class MissingNoSearch {

	public static void main(String[] args) {
		int[] arr = createArray();
		arr = removeElements(arr, 2);
		findMissing(arr);
	}
	
	public static void findMissing(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != i) {
				System.out.println("Missing no is : "+i+" :: at : "+i);
			}
		}
	}
	public static int[] removeElements(int[] arr, int noOfElements) {
		for(int i=0;i<noOfElements;i++) {
			Random random = new Random();
			int n = random.nextInt(100);
			System.out.println("Removed element : "+arr[n]+" : at : "+n);
			arr[n] = n+100;
		}
		return arr;
		
	}
	public static int[] createArray() {
		int[] arr = new int[100];
		for(int i=0;i<arr.length;i++) {
			arr[i] = i;
		}
		return arr;
	}
}
