package com.ask.java.strings;

class Test {
	String a="Hello";
	
	public void m1() {
		print();
		deref();
		Runtime.getRuntime().gc();
		print();
	}
	
	public void deref() {
		a=null;
	}
	
	public void print() {
		System.out.println("Print = "+a +" :: hc "+a.hashCode());
	}
}
public class StringFinal {

	public static void main(String[] args) {
		Test t = new Test();
		t.m1();
	}
}
