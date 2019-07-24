package com.java8.predefinedfunctionalinterface.bi.predicate;

import java.util.function.BiPredicate;

public class BiPredicateBasic {

	public static void main(String[] args) {
		BiPredicate<Integer, Integer> p = (a, b) -> (a + b) % 2 == 0;
		System.out.println(	p.test(10,  20));
	}
}
