package com.ask.java.modifiers2;

import com.ask.java.modifiers1.DefaultExp1;

public class DefaultExp3 extends DefaultExp1{

	public static void main(String[] args) {
		//System.out.println(a); // DEFAULT NOT accessible from another package
		System.out.println(b);
		System.out.println(c);
		
//		DefaultExp1 e1 = new DefaultExp1();
//		System.out.println("protected "+e1.b);
	}

}
