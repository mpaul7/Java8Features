package com.java8.predefinedfunctionalinterface.bi.function;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionBasic {
	
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> f = (a,b) -> a*b;
		System.out.println(f.apply(10,  20));
		
		BiFunction<String, Integer, Student> f2 = (name, rollno) -> new Student(name, rollno);
		ArrayList<Student> l = new ArrayList<Student>();
		l.add(f2.apply("mpaul", 100));
		System.out.println(l);
	}
}
