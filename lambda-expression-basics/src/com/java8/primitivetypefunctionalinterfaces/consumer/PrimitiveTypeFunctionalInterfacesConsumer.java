package com.java8.primitivetypefunctionalinterfaces.consumer;

import java.util.function.BiConsumer;
import java.util.function.IntConsumer;
import java.util.function.ObjDoubleConsumer;

public class PrimitiveTypeFunctionalInterfacesConsumer {

	public static void main(String[] args) {


		IntConsumer c = i -> System.out.println(i * i);
		c.accept(10);
		
		/*
		 * LongConsumer 
		 * accept (long l)
		 * 
		 * DoubleConsumer 
		 * accept(double d)
		 * 
		 * ObjIntConsumer
		 * public void accept(T t, int i)
		 * 
		 * ObjLongConsumer<T>
		 * public void accept(T t, long l)
		 * 
		 * ObjDoubleConsumer(<T>
		 * public void accept(T t, double d)
		 * 
		 * BiConsumer<Employee, Double> c2  = (e, d) -> e.salary = e.salary + d;
		 * Employee e = new Employee("mpaul", 1000);
		 * c2.accept(e, 500.0)
		 * 
		 */
		
		ObjDoubleConsumer<Employee> c3 = (e, d) -> e.salary = e.salary + d;
		Employee e = new Employee("mpaul",  1000);
		c3.accept(e, 500.0);
		System.out.println(e.salary);
	}

}
