package com.ask.java.searching;

import java.util.Arrays;

public class BinarySearching {

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 9, 6, 8, 3, 6 };
		System.out.println("Length of array = " + arr.length);
		Arrays.sort(arr);
		//Scanner sc = new Scanner(System.in);
		
		int n = 4;/*sc.nextInt();
		sc.close();*/
		System.out.print("Enter a number to search = "+n+" \n");
		int index = binarySearch(n, arr, 0, arr.length-1);
		System.out.println("Element "+n+" found at "+index+" index");
		
	}
	
	public static int binarySearch(int n, int[] arr, int firstIndex, int lastIndex) {
		if(lastIndex >= 1) {
			int mid = firstIndex+(lastIndex-firstIndex)/2;
			if(arr[mid] == n) {
				
				return mid;
			}
				
			if(arr[mid] > n)
				return binarySearch(n, arr, firstIndex, lastIndex);
			if(arr[mid] < n)
				return binarySearch(n, arr, firstIndex, lastIndex);
		}
		return lastIndex;
		
	}

}
