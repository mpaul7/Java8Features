package com.java8.primitivetypefunctionalinterfaces.consumer;

public class Employee {
	
	String name;
	double salary;
	
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}
}
