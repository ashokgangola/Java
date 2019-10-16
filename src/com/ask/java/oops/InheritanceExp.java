package com.ask.java.oops;

public class InheritanceExp {

	public static void main(String[] args) {
		Employee e = new Programmer();
		System.out.println("Salary = "+e.salary);
		e.m1();
		//System.out.println("Bonus = "+e.bonus);
	}

}

class Employee {
	int salary = 50000;
	public void m1() {
		System.out.println("Superclass = "+salary);
	}
}

class Programmer extends Employee{
	int salary = 100;
	int bonus = 10000;
	public void m1() {
		System.out.println("Subclass = "+salary);
	}
}
