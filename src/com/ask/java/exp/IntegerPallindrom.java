package com.ask.java.exp;

public class IntegerPallindrom {

	public static void main(String[] args) {
		int i = 121;
		int temp = i;
		int sum = 0;
		while (i > 0) {
			int rem = i % 10;
			sum = (sum * 10) + rem;
			i = i / 10;
		}
		if (temp == sum) {
			System.out.println("palindrome number ");
		} else {
			System.out.println("not palindrome");
		}
	}

}
