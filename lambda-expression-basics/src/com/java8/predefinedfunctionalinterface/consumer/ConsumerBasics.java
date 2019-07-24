package com.java8.predefinedfunctionalinterface.consumer;

import java.util.ArrayList;
import java.util.function.Consumer;

import com.java8.predefinedfunctionalinterface.consumer.Employee;

public class ConsumerBasics {

	public static void main(String[] args) {

		Consumer<String> c = s -> System.out.println(s);
		c.accept("Hello");
		
		// ========================================
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("John", 100));
		l.add(new Employee("Bob", 65));
		l.add(new Employee("Tom", 55));
		l.add(new Employee("Alex", 45));
		l.add(new Employee("Chin", 25));
		
		Consumer<Employee> c2 = e -> {
			System.out.println(e.name);
			System.out.println(e.salary);
			System.out.println();
		};
		
		for (Employee e : l) {
			c2.accept(e);
		}
	}
}
