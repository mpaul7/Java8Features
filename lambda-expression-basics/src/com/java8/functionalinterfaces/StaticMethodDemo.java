package com.java8.functionalinterfaces;

interface Interf2 {
	public static void m1() {
		System.out.println("Interface static method");
	}
}

// From Java8 onwards, just to define general utility methods, no where related to 
//object state. Such method can be defined in functional interfaces as static methods.
// these methods can be called by any class, whether that class is implementation class or not?
// As interface static methods are not available to implementation class
// So these static methods can not be overridden.
public class StaticMethodDemo implements Interf2 {

	public static void main(String[] args) {
		// m1();  incorrect
		// interface static method by default is not available to the implementation class.
		// StaticMethodDemo.m1(); incorrect
		StaticMethodDemo d = new StaticMethodDemo();
		// d.m1(); incorrect
		Interf2.m1(); // interface static method can be called only by Interface reference.

	}

}

// since interface static methods are not available to the imlementation class
// so overriding interface static methods is not allowed. 
