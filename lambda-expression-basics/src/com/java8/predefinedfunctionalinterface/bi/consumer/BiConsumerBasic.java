package com.java8.predefinedfunctionalinterface.bi.consumer;

import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

public class BiConsumerBasic {

	public static void main(String[] args) {
		BiConsumer<String, String> c = (s1, s2) -> System.out.println(s1 + s2);

		c.accept("m", "paul");
		
		//====================================
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		
	BiFunction<String, Double, Employee> f  = (name, salary) -> new Employee(name, salary);
	l.add(f.apply("a", 10.0));
	l.add(f.apply("b", 20.0));
	l.add(f.apply("c", 30.0));
	l.add(f.apply("d", 40.0));
	l.add(f.apply("e", 50.0));
		
	BiConsumer<Employee, Double> c2 = (e, increment) -> e.salary = e.salary + increment;
	for(Employee e: l){
		c2.accept(e, 500.0);
	}
	for (Employee e : l) {
		System.out.println("employee Name: "  + e.name);
		System.out.println("Employee Salary: " + e.salary);
		System.out.println();
	}

	}

}
