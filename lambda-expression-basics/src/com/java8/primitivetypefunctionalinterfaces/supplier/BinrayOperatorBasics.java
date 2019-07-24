package com.java8.primitivetypefunctionalinterfaces.supplier;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class BinrayOperatorBasics {

	public static void main(String[] args) {
		/*
		 * If in a biFunction, all the parameters have the same return type them we go for binaryOperator
		 * biFunction<T, T, T>
		 */
		
		
		BiFunction<String, String, String> f1 = (s1, s2) -> s1 + s2;
		System.out.println(f1.apply("m", "paul"));
		
		BinaryOperator<String> f2 = (s1, s2) -> s1 + s2;
		System.out.println(f2.apply("m", "paul"));
		
		// Primitive BinaryOperator
		/*
		 * interface IntBinaryOperator
		 * public int applyAsInt(int i1, int i2))
		 * 
		 * interface LongBinaryOperator
		 * public long applyAsLong(long l1, long l2)
		 * 
		 * interface DoubleBinaryOperator
		 * public double applyAsDouble(double d1, double d2)
		 * 
		 * 
		 */
		IntBinaryOperator f3 = (i1, i2) -> i1 + i2;
		System.out.println(f3.applyAsInt(3, 4));
		

	}

}
