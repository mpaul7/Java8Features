package com.java8.predefinedfunctionalinterface.function;

import java.util.function.Function;

public class FunctionChaining {

	// Inside Function, ther are default methods
	// andThen() -> f1.andThen(f2);
	// compose() -> f1.compose(f2); = compose is reverse of andThen()
	// identity -> static method  - > what ever input we provide, it returns the same output.
	public static void main(String[] args) {
		Function<String, String> f1  = s -> s.toUpperCase();
		Function<String, String> f2 = s -> s.substring(0, 2);
		System.out.println(f1.andThen(f2).apply("mpsingh"));
		System.out.println(f1.compose(f2).apply("mpsingh"));
		
		//Example : compose is reverse of andThen()
		Function<Integer, Integer> f3  = i -> i + i;
		Function<Integer, Integer> f4 =  i -> i * i * i;
		System.out.println(f3.andThen(f4).apply(2)); // => 64
		System.out.println(f3.compose(f4).apply(2)); // => 16
		
		//===================================================
		// identity()
		Function<String, String> f5 = Function.identity();
		
		System.out.println(f5.apply("mpaul"));
	}
}
