package com.ask.java.exp;

public class StaticExp {

	public final static void main(String... ar) {
		try {
			Stu s = Stu.class.newInstance();
			System.out.println(s.a);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class Stu {
	int a = 10;
	public void m1() {
		
	}
}
