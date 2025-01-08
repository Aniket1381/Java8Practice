package com.DefaultAndStatic;

public interface Vehicle {

	//public abstract void show();
	
	default void start() {
		System.out.println("Vehicle is Starting....");
	}
	
	static void display() {
		System.out.println("Display method from Vehicle ...");
	}
}
