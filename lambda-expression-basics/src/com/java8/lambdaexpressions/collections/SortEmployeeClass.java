package com.java8.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;

public class SortEmployeeClass {

	public static void main(String[] args) {

		ArrayList<Employee> l = new ArrayList<Employee>();
		l.add(new Employee(200, "Josh"));
		l.add(new Employee(400, "Tom"));
		l.add(new Employee(300, "Bob"));
		l.add(new Employee(100, "Alex"));
		
		// Before Sorting
		System.out.println("Before Sorting :" + l);

		// After sorting
		Collections.sort(l, (e1, e2) -> (e1.id < e2.id)? -1: (e1.id > e2.id)? 1 : 0);
		System.out.println("After Sorting :" + l);
	}

}
