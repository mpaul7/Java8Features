package com.java8.primitivetypefunctionalinterfaces.supplier;

import java.util.function.*;
public class UnaryOperatorBasics {

	public static void main(String[] args) {
		/*
		 * It is a speial type of Function where input type and return type are the same
		 * interface UnaryOperator<T>
		 * public T apply(T t)
		 * 
		 */
		
		UnaryOperator<Integer> o = i -> i * i;
		System.out.println(o.apply(6));
		
		/*
		 * Primitive Version of UnaryOperator
		 * 
		 * interface IntUnaryOperator
		 * public int applyAsInt(int i)
		 * 
		 * interface LongUnaryOperator
		 * public long applyAsLong(long l);
		 * 
		 * interface DoubleUnaryOperator
		 * public double applyAsDouble(double d)
		 * 
		 */
		
		IntUnaryOperator o2 = i -> i * i;
		System.out.println(o2.applyAsInt(6));
		

	}

}
