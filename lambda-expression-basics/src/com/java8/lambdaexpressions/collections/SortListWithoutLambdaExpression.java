package com.java8.lambdaexpressions.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		if(o1 > o2)
			return -1;
		else if (o1 < o2)
			return 1;
		else  
			return 0;
	}
}

public class SortListWithoutLambdaExpression {
	
	public static void main(String[] args) {
		// No object of comparator is passed, is it DNSO
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);
		
		//Note: In Array list insertion order is preserved.
		System.out.println("Before sorting: " + l);	
		
		//After sorting without comparator object - DNSO
		Collections.sort(l);
		System.out.println("After sorting: " + l);	
		
		//After sorting with comparator object - customised sorting
				Collections.sort(l, new MyComparator());
				System.out.println("After customiszed sorting: " + l);	
	}

}


