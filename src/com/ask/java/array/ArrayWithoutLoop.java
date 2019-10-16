package com.ask.java.array;

import java.util.Arrays;

public class ArrayWithoutLoop {

	public static void main(String[] args) {

		int[] arr = { 10, 56, 32, 20 };
		Arrays.sort(arr);
		m1(arr, 0);
	}
//TO PRINT ARRAY WITHOUT LOOP
	public static void m1(int[] arr, int index) {
		if (index < arr.length) {
			int ele = arr[index];
			System.out.print(ele);
			if (index < arr.length - 1)
				System.out.print(",");
			index = index + 1;
			m1(arr, index);
		}
	}
}
