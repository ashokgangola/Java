package com.ask.java.strings;

public class StringProb1 {

	public static void main(String[] args)  throws MyException,NewException {
			m();
		
	}
	
	public static void m() throws MyException,NewException {
		String exp = "MyException";
		try {
			if(exp.equals("MyException")) {
				throw new MyException();
			} else {
				throw new NewException();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class MyException extends Exception {
	public String m1() {
		System.out.println("MyException");
		return "MyException";
	}
}


class NewException extends MyException {
	public String m1() {
		System.out.println("NewException");
		return "NewException";
	}
}


