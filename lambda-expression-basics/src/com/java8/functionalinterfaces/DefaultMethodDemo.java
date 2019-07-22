package com.java8.functionalinterfaces;

interface interf{
	default void m1() {
		System.out.println("Default m1()");
	}
	
	default void m2() {
		System.out.println("Default m2()");
	}
}

public class DefaultMethodDemo implements interf {

	public void m2() {
		System.out.println("Overrided m2()");
	}
	
	public static void main(String[] args) {
		DefaultMethodDemo d = new DefaultMethodDemo();
		d.m1();
		
		d.m2();
	}

}
