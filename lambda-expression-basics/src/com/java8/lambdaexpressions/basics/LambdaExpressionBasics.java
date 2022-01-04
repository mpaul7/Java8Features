
/*
 * Lambda expression is used to bring benefits of functional programming into Java.
 * It is anonymous function (nameless)
 * It does not have 
 * - name
 * - return type
 * - access modifier
 * =================
 * Similar to method body lambda expression body also can contain multiple statements.
if more than one statements are present then enclose them inside curly braces.
if one statement is present then curly braces are optional.
===============
* How to call lambda function
* - to call lambda expressions, lambda functions are required. 
 * */



package com.java8.lambdaexpressions.basics;

import com.java8.lambdaexpressions.basics.interfaces.IAdd;
import com.java8.lambdaexpressions.basics.interfaces.ISquareInt;
import com.java8.lambdaexpressions.basics.interfaces.IStringLength;

// Normally we have implementation classes for all the 
// interfaces ann then we do the implementation of abstract methods.
// However, using lambda expressions, implemenation class is not needed. 
class StringLength implements IStringLength{

	@Override
	public int getLength(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
}

class SquareInt implements ISquareInt{

	@Override
	public int squareInt(int x) {
		return x*x;
	}
}

class AddInt implements IAdd{

	@Override
	public int add(int a, int b) {
		return a+b;
	}
}

public class LambdaExpressionBasics {
	
	String str = "HelloWorld";
	
	public static void main(String[] args) {
		//get string Length
		IStringLength i = s -> s.length();
		int sLength = i.getLength("HelloWorld");
		System.out.println("String length is : " + sLength );
		
		//Square lambda expression
		ISquareInt sq = x -> x*x;
		int iSquare = sq.squareInt(5);
		System.out.println("The Square of the number is: " + iSquare);
		
		//add lambda expression
		IAdd addInt = (a, b) -> a+b;
		int iAdd = addInt.add(3,4);
		System.out.println("The addition of the number is: " + iAdd);
	}
}
