package com.ask.java.twodarray;

import java.util.LinkedList;
import java.util.List;

public class SprialPrint1 {

	public static void main(String[] args) {
		int row = 5;
		int col = 4;
		int[][] arr = get2dArray(row, col);
		print2dArray(arr,row,col);
		System.out.println("Length = "+arr.length);
		List<Integer> spr = new LinkedList<Integer>();
		printOtr(2, 1, row, col, arr, spr);

		for(int ele : spr) {
			System.out.print(ele+",");
		}
	}

	public static void printOtr(int rowMinus, int colMinus, int rowLength, int collength, int[][] arr, List<Integer> spr) {
//		if(rowLength%2 == 1)
//			rowLength = rowLength-rowMinus+1;
		System.out.println("row = "+(rowLength-rowMinus));
		for (int i = rowMinus; i < rowLength-rowMinus; i++) {
			if (i == rowMinus) {
				for (int j = colMinus; j < collength-colMinus; j++) {
					spr.add(arr[i][j]);
				}
			}
		}
	}
	
	public static void getLast(int rowMinus, int colMinus, int rowLength, int collength, int[][] arr, List<Integer> spr) {
		for (int i = rowMinus; i < rowLength-rowMinus; i++) {
			if (i != rowMinus) {
				for (int j = colMinus; j < collength-colMinus; j++) {
					spr.add(arr[i][j]);
				}
			}
		}
	}
	
	public static void outerArr(int rowStart,int colStart, int row, int col, int[][] arr, List<Integer> spr) {
		for (int i = rowStart; i < row-rowStart; i++) {
			if (i == rowStart) {
				for (int j = colStart; j < col-colStart; j++) {
					spr.add(arr[i][j]);
				}
			}
			if (i != rowStart && i != row - rowStart) {
				for (int j = colStart; j < col; j++) {
					if (j == col - 1)
						spr.add(arr[i][j]);
				}
			}
			if (i == row - 1) {
				for (int j = col - 1; j >= colStart; j--) {
					spr.add(arr[i][j]);
				}
			}

		}
		getFirstCol(rowStart, colStart, row, col, arr, spr);
	}

	public static void getFirstCol(int rowStart,int colStart, int row, int col, int[][] arr, List<Integer> spr) {
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
	
	public static void print2dArray(int[][] arr, int row, int col) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
