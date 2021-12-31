package com.java8.functionalinterfaces;

// Functional interfaces can have any number default methods. 
// Untill v1.7, only abstract methods were allowed.
// every method inside interface is be default public abstract, whether we explicitly declare it or not.
// Similarly every variable is by default public static final, whether we explicitly declare it or not.
// After v1.8 we can declare concrete methods inside functional interfaces
// these concrete methods are defined with default or static keyword.

interface interf{
	default void m1() {
		System.out.println("Default m1()");
	}
	
	default void m2() {
		System.out.println("Default m2()");
	}
}

public class DefaultMethodDemo implements interf {
	// the implentation class can use the concrete method directly, or it can override.
	public void m2() {
		System.out.println("Overrided m2()");
	}
	
	public static void main(String[] args) {
		DefaultMethodDemo d = new DefaultMethodDemo();
		d.m1();
		
		d.m2();
	}

}
