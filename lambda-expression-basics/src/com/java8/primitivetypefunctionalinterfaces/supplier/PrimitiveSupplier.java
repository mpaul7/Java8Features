package com.java8.primitivetypefunctionalinterfaces.supplier;

import java.util.function.IntSupplier;

public class PrimitiveSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * interface IntSupplier
		 * public int getAsInt();
		 * 
		 * LongSupplier
		 * public long getAsLong();
		 * 
		 * DoubleSupplier
		 * public double getAsDouble();
		 * 
		 * BooleanSupplier
		 * public boolean getAsBoolean();
		 * 
		 */

		IntSupplier s = () -> (int)(Math.random()*10);
		System.out.println(s.getAsInt());
		
	}

}
