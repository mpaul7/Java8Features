package com.java8.predefinedfunctionalinterface.function;

import java.util.function.Function;

/*
 * Definition of Function
 * interface Function<T, R>{
 * 	R apply(T, R)
 * }
 */
public class FunctionBasics {

	public static void main(String[] args) {
		Function<String, Integer> f = s -> s.length();
		System.out.println(f.apply("durga"));
		
		Function<Integer, Integer> f2 = i -> i*i;
		System.out.println(f2.apply(3));
		
		String str = "a b c d";
		Function<String, String> f3 = s -> s.replaceAll(" ", "");
		System.out.println(f3.apply(str));
		
		// to find number of spaces in a string
		Function<String, Integer> f4 = s1 -> s1.length()  - s1.replaceAll(" ", "").length();
		System.out.println(f4.apply(str));
		
	}
}
