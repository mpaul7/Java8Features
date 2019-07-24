package com.java8.primitivetypefunctionalinterfaces.predicate;

import java.util.function.IntPredicate;

public class PrimitivePredicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * interface IntPredicate{
		 * public boolean teat(int i);
		 */

		int[]x = {0, 10, 15, 20, 25, 30};
		IntPredicate p = i-> i % 2 == 0;
		for (int x1 : x) {
			if (p.test(x1))
				System.out.println(x1);
		}
		
		/*
		 * interface LongPredicate
		 * public boolean test(long t);
		 * 
		 * interface DoublePredicate
		 * public boolean test (double t)
		 */
	}

}
