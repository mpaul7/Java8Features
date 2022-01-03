package com.java8.predefinedfunctionalinterface.predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;
/*
 * to  commonly check certain condition, for example employee age.
 * to fulfill commonly required task, predefined functional interfaces are used.  
 * Java1.8 provided some predefined functional interfaces
 * - Predicate
 * - Function
 * - Consumer
 * - Supplier
 * These predefined functional interfaces are defined in "Java.util.function"
 * 
 * ==========================
 * Predicate
 * ==========================
 * Based on certain conditions, if a functional interface returns True/False
 * A boolean value functional interface is called Predicate.
 * It contains only one abstract method called "test()"
 * Definition
 * ----------
 * interface Predicate<T>{
 * 	boolean test(T t)
 * }
 */

public class PredicateBasics {

	public static void main(String[] args) {
		// Example 1
		System.out.println("======= Example 1 ==========");
		Predicate<Integer> p1 = I -> I > 10;
		System.out.println(p1.test(100));
		System.out.println(p1.test(5));
		
		// Example 2
		System.out.println("======= Example 2 ==========");
		Predicate<String> p2 = s -> s.length() > 5;
		System.out.println(p2.test("abcdef"));
		System.out.println(p2.test("abc"));
		
		// Example 3
		System.out.println("======= Example 3 ==========");
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(20);

		Predicate<Collection> p3 = c -> c.isEmpty();
		System.out.println(p3.test(l));

		
		// Example 4
		System.out.println("======= Example 4 ==========");
		String[] names = { "Sunny", "Kevin", "Kathy", "Kat", "Jhon", "Tom" };

		Predicate<String> startsWithK = s -> s.charAt(0) == 'K';
		for (String s : names) {
			if (startsWithK.test(s)) {
				System.out.println(s);
			}
		}
		
		// Example 5
		System.out.println("======= Example 5 ==========");
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

		/*
		*====================
		* Predicate Joining, and default methods.
		* ===================
		* p1: a number greate than 10 or not? 
		* To check a number less than 10 or not, just negate the p1 predicate.
		* p1.negate(): 
		* p2: number is an even number
		* If we want to check that the given number is less than 10 and is an even number, then we can join two Predicates. 
		* p1.and(p2)
		* P1.or(p2)
		* 
		* Note: negate(), or() and and() are defined as defatul methods in Predicate.
		* 
		* 
		*/
		System.out.println("======= Example 6 ==========");
		int[] x = {0, 5, 10, 15, 20, 25, 30};
		Predicate<Integer> p7  = i -> i> 10;
		Predicate<Integer> p8 = i ->  i % 2 == 0;
		
		System.out.println("The numbers greater than 10 are: ");
		m1(p7, x);
		System.out.println("The even numbers are: ");
		m1(p8, x);
		System.out.println("The numbers not greater than 10 are: ");
		m1(p7.negate(), x);
		System.out.println("The numbers greater than 10 and even are: ");
		m1(p7.and(p8), x);
		System.out.println("The numbers greater than 10 or even are: ");
		m1(p7.or(p8), x);
		
		/*
		* =========================
		* Predicate Static Method
		* =========================
		* There is one static method - isEqual() in predicate
		* isEqual()
		* public static Predicate isEqual(T t)
		*/
		System.out.println("======= Example 7 ==========");
		Predicate<String> p9 = Predicate.isEqual("mpaul");
		System.out.println(p9.test("mpaul")); // => true
}
	public static void m1(Predicate<Integer> p, int[] x){
		for (int x1: x){
			if (p.test(x1))
				System.out.println(x1);
		}
	}
		
}
