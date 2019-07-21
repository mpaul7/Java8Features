package com.java8.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyLambdaComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		return (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0;
	}
}

public class SortListWithLambdaExpression {

	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);

		// After sorting with comparator object - customised sorting
		Collections.sort(l, new MyLambdaComparator());
		System.out.println("After customiszed sorting 1: " + l);

		// With Lambda exp there is no need of separate Mycomparator class
		// Simply pass lambda expression to Sort()
		Collections.sort(l, (o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0);
		System.out.println("After customiszed sorting 2: " + l);
	}

}
