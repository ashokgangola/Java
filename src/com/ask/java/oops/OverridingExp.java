package com.ask.java.oops;

public class OverridingExp {

	public static void main(String[] args) {
		Vehicle v = new Bike();
		v.run();
	}

}

class Bike extends Vehicle {

	public void run() {
		System.out.println("Bike is running");
	}
}

class Vehicle {
	public void run() {
		System.out.println("Vehicle is running");
	}
}