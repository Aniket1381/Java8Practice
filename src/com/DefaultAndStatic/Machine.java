package com.DefaultAndStatic;

public interface Machine {

	default void start() {
		System.out.println("Machine is Starting....");
	}
	
	static void display() {
		System.out.println("Display method from Machine.....");
	}
}
