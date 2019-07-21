package com.java8.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortTreeMapWithLambdaExpression {

	public static void main(String[] args) {
		TreeMap<Integer, String> l1 = new TreeMap<Integer, String>();
		l1.put(10, "Jhone");
		l1.put(30, "Alex");
		l1.put(20, "Bob");
		l1.put(50, "Charlie");
		l1.put(40, "Tiger");
		l1.put(60, "tom");
		// Without Sorting
		System.out.println("Before sorting : " + l1);
		
		
		 // With Lambda exp there is no need of separate Mycomparator class // Simply
		 // pass lambda expression to Sort() Collections.sort(l, (o1, o2) -> (o1 > o2) ?
		TreeMap<Integer, String> l2 = new TreeMap<Integer, String>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		l2.put(10, "Jhone");
		l2.put(30, "Alex");
		l2.put(20, "Bob");
		l2.put(50, "Charlie");
		l2.put(40, "Tiger");
		l2.put(60, "tom");
		// Without Sorting
		System.out.println("After sorting : " + l2);
	}

}
