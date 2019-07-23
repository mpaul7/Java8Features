package com.java8.predefinedfunctionalinterface.function;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class StudentGrade {

	public static void main(String[] args) {
		ArrayList<Student> l = new ArrayList<Student>();

		l.add(new Student("John", 100));
		l.add(new Student("Bob", 65));
		l.add(new Student("Tom", 55));
		l.add(new Student("Alex", 45));
		l.add(new Student("Chin", 25));

		Function<Student, String> f = s -> {
			int marks = s.marks;
			if (marks >= 80) {
				return "A[Distinction]";
			} else if (marks >= 60) {
				return "B[First Class]";
			}
			if (marks >= 50) {
				return "C[Second Class]";
			} else
				return "E[Failed]";
		};

		for (Student s : l) {
			System.out.println("Student Name: " + s.name);
			System.out.println("Student Marks: " + s.marks);
			System.out.println("Student Grade: " + f.apply(s));
		}

		// ==================================================

		Predicate<Student> p = s -> s.marks >= 60;
		System.out.println("==================================================");

		for (Student s : l) {
			if (p.test(s)) {
				System.out.println("Student Name: " + s.name);
				System.out.println("Student Marks: " + s.marks);
				System.out.println("Student Grade: " + f.apply(s));
			}
		}

	}
}
