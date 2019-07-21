package com.java8.lambdaexpressions;

import com.java8.lambdaexpressions.functional.interfaces.IAdd;
import com.java8.lambdaexpressions.functional.interfaces.ISquareInt;
import com.java8.lambdaexpressions.functional.interfaces.IStringLength;

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
		
		//Square lembda expression
		ISquareInt sq = x -> x*x;
		int iSquare = sq.squareInt(5);
		System.out.println("The Square of the number is: " + iSquare);
		
		//add lambda expression
		IAdd addInt = (a, b) -> a+b;
		int iAdd = addInt.add(3,4);
		System.out.println("The addition of the number is: " + iAdd);
	}
}
