package com.java8.predefinedfunctionalinterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class PredicateBasics {

	public static void main(String[] args) {
		Predicate<Integer> p1 = I -> I > 10;
		System.out.println(p1.test(100));
		System.out.println(p1.test(5));

		Predicate<String> p2 = s -> s.length() > 5;
		System.out.println(p2.test("abcdef"));
		System.out.println(p2.test("abc"));

		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);

		Predicate<Collection> p3 = c -> c.isEmpty();
		System.out.println(p3.test(l));
		System.out.println("===================================");

		// ===================================
		// Predicate Joining
		// p.negate()
		// p1.and(p2)
		// P1.or(p2)
		// These are default methods in Predicate
		
		// There is one static method 
		// isEqual()
		//public static Predicate isEqual(T t)

		System.out.println("===================================");
		// =====================================

		String[] names = { "Sunny", "Kevin", "Kathy", "Kat", "Jhon", "Tom" };

		Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
		for (String s : names) {
			if (startsWithK.test(s)) {
				System.out.println(s);
			}
		}
		
		System.out.println("===================================");
		// Predicate example to remove null value and empty String from a given list
		String[] names2 = {"Tom", "", null, "Ravi", "", "Paul", null};
		Predicate<String> p5 = s -> s != null && s.length() != 0;
		ArrayList<String> l2 = new ArrayList<String>();
		for (String s : names2) {
			if(p5.test(s))
			{
				l2.add(s);
			}		
		}
		System.out.println(l2);

		
		//  isEqual() static method
		
		Predicate<String> p6 = Predicate.isEqual("mpaul");
		System.out.println(p6.test("mpaul")); // => true
}
}
