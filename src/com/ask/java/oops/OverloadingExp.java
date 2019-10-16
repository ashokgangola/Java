package com.ask.java.oops;

public class OverloadingExp {

	public static void main(String[] args) {
		Calculation cal = new Calculation();
		cal.add(10, 20000000000l);
	}

}

class Calculation {
	
	public int add(int a, int b) {
		System.out.println("int");
		return a+b;
	}
	
	public long add(int a, long b) {
		return a+b;
	}
}
