package com.java8.predefinedfunctionalinterface.function;

import java.util.ArrayList;
import java.util.function.Function;

public class EmployeeSalary {
	
	public static void main(String[] args) {
		
		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee("John", 100));
		l.add(new Employee("Bob", 65));
		l.add(new Employee("Tom", 55));
		l.add(new Employee("Alex", 45));
		l.add(new Employee("Chin", 25));
		
		Function<ArrayList<Employee>, Double> f = l1 -> {
			double total = 0;
			for (Employee e : l) {
				total = total + e.salary;
			}
			return total;
		};
		
		System.out.println("The total salary of employees is: " + f.apply(l));
	}

}
