package com.java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsBasics {

	// Concept of
	// filter()
	// map()
	// count()
	// sorted ()
	// forEach()
		// This methid does not return anything
		// It can take lambda expression as an argument, and can apply this expression to each of the element.
	// toArray
	// of()
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<Integer>();
		l.add(10);
		l.add(0);
		l.add(15);
		l.add(5);
		l.add(20);

		System.out.println("Original List :" + l);

		// Filter Even numbers
		List<Integer> l2 = l.stream().filter(I -> I % 2 == 0).collect(Collectors.toList());
		System.out.println("Filtered List: " + l2);

		// Mapping List
		List<Integer> l3 = l.stream().map(I -> I * 2).collect(Collectors.toList());
		System.out.println("Mapped List: " + l3);

		// Count()
		long count = l.stream().filter(I -> I % 2 == 0).count();
		System.out.println("Number of Even numbers: " + count);

		// sorted()
		List<Integer> l4 = l.stream().sorted().collect(Collectors.toList());
		System.out.println("DNSO sorted List: " + l4);

		List<Integer> l5 = l.stream().sorted((o1, o2) -> (o1 > o2) ? -1 : (o1 < o2) ? 1 : 0).collect(Collectors.toList());
		System.out.println("Customized sorted List: " + l5);

		// min(), max()
		Integer minValue = l.stream().min((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("Minimum Value: " + minValue);

		Integer maxValue = l.stream().max((o1, o2) -> o1.compareTo(o2)).get();
		System.out.println("Maximum Value: " + maxValue);
		
		//forEach()
		l.stream().forEach(s->System.out.println(s));
		System.out.println("======================");
		l.stream().forEach(System.out::println);
		
		//toArray
		Integer[] array = l.stream().toArray(Integer[] :: new);
		System.out.println("====== Printing Array ================");
		for (Integer x : array) {
			System.out.println(x);
		}
		
		//of() 
		Stream<Integer> s = Stream.of(9, 99, 999, 9999, 99999);
		System.out.println("====== Stream of numbers ================");
		s.forEach(System.out::println);
		
		Double[] d = {10., 10.1, 10.2, 10.3, 10.4};
		Stream<Double> s2 = Stream.of(d);
		System.out.println("====== Array as Stream of numbers ================");
		s2.forEach(System.out::println);
	}

}
