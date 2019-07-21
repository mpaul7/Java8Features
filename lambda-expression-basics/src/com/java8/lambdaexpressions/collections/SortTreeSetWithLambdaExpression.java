package com.java8.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class SortTreeSetWithLambdaExpression {

	public static void main(String[] args) {
		TreeSet<Integer> l1 = new TreeSet<Integer>();
		l1.add(10);
		l1.add(0);
		l1.add(15);
		l1.add(5);
		l1.add(20);
		
		// Without Sorting
		System.out.println("Before sorting : " + l1);
		
		TreeSet<Integer> l2 = new TreeSet<Integer>((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		l2.add(10);
		l2.add(0);
		l2.add(15);
		l2.add(5);
		l2.add(20);
		// Without Sorting
		
		 // With Lambda exp there is no need of separate Mycomparator class // Simply
		 // pass lambda expression to Sort() Collections.sort(l, (o1, o2) -> (o1 > o2) ?
		
		System.out.println("After sorting : " + l2);
	}

}
