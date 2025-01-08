package com.DefaultAndStatic;

public class Car extends Sedan implements Vehicle,Machine{

//	@Override
//	public void start() {
//		System.out.println("Car is starting...");
//	}
	
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.start();
		Vehicle.display();
		Machine.display();
	}
}
