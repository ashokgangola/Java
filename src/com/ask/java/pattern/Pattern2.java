package com.ask.java.pattern;

public class Pattern2 {

	public static void main(String[] args) {
		int n = 4;
		int flag = 1;
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(flag);
				if(j!=i) {
					System.out.print("*");
				}
				flag++;
			}
			System.out.println();
		}
		//flag--;
		int minus = n;
		int first = flag-n;
		for(int i=0;i<n;i++) {
			for(int j=n;j>i;j--) {
				System.out.print(first);
				if(j-1 != i) {
					System.out.print("*");
				}
				first ++;
				flag--;
			}
			minus--;
			System.out.println();
			first = flag - minus; 
		}

	}

}
