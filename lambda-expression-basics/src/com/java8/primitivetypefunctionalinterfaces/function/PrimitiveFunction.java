package com.java8.primitivetypefunctionalinterfaces.function;

import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToIntFunction;

public class PrimitiveFunction {

	public static void main(String[] args) {

		IntFunction<Integer> f = i -> i * i;
		System.out.println(f.apply(5));
		
		ToIntFunction<String> f2 = s -> s.length();
		System.out.println(f2.applyAsInt("mpaul"));
		
		IntToDoubleFunction f3 = i -> Math.sqrt(i);
		System.out.println(f3.applyAsDouble(3));
		
		/*
		 * IntFunction(R)
		 * public R apply(int i)
		 * 
		 * LongFunction(R)
		 * public R apply (long l)
		 * 
		 * DoubleFunction(r)
		 * public R apply(double d)
		 * 
		 * ======================================
		 * 
		 * ToIntFunction<T>
		 * public int applyAsInt(T t)
		 * 
		 * ToLongFunction<T>
		 * public long applyAsLong(T t)
		 * 
		 * ToDoubleFunction<T>
		 * public double applyAsDouble(T t)
		 * 
		 * ======================================
		 * 
		 * IntToLongFunction
		 * public long applyAsLong(int i)
		 * 
		 * IntToDobuleFunction
		 * public double applyAsDouble(int i)
		 * 
		 * ======================================
		 * 
		 * LongToIntFunction
		 * public int applyAsInt(long l)
		 * 
		 * LongToDobuleFunction
		 * public double applyAsDouble(long l)
		 * 
		 * ======================================
		 * 
		 * DobuleTointFunction
		 * public int applyAsInt(double d)
		 * 
		 * DobuleToLongFunction
		 * public long applyAsLong(double d)
		 * 
		 * ======================================
		 * 
		 * ToIntBiFunction<T,U>
		 * public int applyAsInt(T, t, U u)
		 * 
		 * ToLongBiFunction<T, U>
		 * public long applyAsLong(T t, U u)
		 * 
		 * ToDoubleBiFunction<t, U>
		 * public double applyAsDouble(T t, U u)
		 * 
		 * ======================================
		 * 
		 */

	}

}
