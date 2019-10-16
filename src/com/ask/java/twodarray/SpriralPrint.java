package com.ask.java.twodarray;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SpriralPrint {

	public static void main(String[] args) {
		int row = 4;
		int col = 4;
		int[][] arr = get2dArray(row, col);
		print2dArray(arr,row,col);
		System.out.println("Length = "+arr.length);
		List<Integer> spr = new LinkedList<Integer>();
		outerArr(row, col, arr, spr);
		if (row > 2 && col > 2) {
			getFirstCol(arr, spr);
		}
		
		int remaininRow = row-2;
		midForward(arr, spr, 1,col);
		midRev(arr, spr, 2,col);
		System.out.println("Last array ::");
		spr.stream().forEach(System.out::print );
	}

	public static void midForward(int[][] arr, List<Integer> spr, int rownum, int col) {
		for (int j = 1; j < col - 1; j++)
			spr.add(arr[rownum][j]);
	}

	public static void midRev(int[][] arr, List<Integer> spr, int rowNum, int col) {
		for (int j = col-2; j >= 1; j--)
			spr.add(arr[rowNum][j]);
	}

	public static void getFirstCol(int[][] arr, List<Integer> spr) {
		for (int i = arr.length - 2; i >= 1; i--) {
			spr.add(arr[i][0]);
		}
	}

	public static int[][] get2dArray(int row, int col) {
		int[][] arr = new int[row][col];
		int flag = 1;
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				arr[i][j] = flag;
				flag++;
			}
		}
		return arr;
	}

	public static void outerArr(int row, int col, int[][] arr, List<Integer> spr) {
		for (int i = 0; i < row; i++) {
			if (i == 0) {
				for (int j = 0; j < col; j++) {
					spr.add(arr[i][j]);
				}
			}
			if (i != 0 && i != row - 1) {
				for (int j = 0; j < col; j++) {
					if (j == col - 1)
						spr.add(arr[i][j]);
				}
			}
			if (i == row - 1) {
				for (int j = col - 1; j >= 0; j--) {
					spr.add(arr[i][j]);
				}
			}

		}
	}
	
	public static void print2dArray(int[][] arr, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
