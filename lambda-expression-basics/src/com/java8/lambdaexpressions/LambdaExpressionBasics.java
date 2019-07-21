package com.java8.lambdaexpressions;

import com.java8.lambdaexpressions.functional.interfaces.StringLength;

class Demo implements StringLength{

	@Override
	public int getLength(String s) {
		// TODO Auto-generated method stub
		return s.length();
	}
	
}

public class LambdaExpressionBasics {
	
	String str = "HelloWorld";
	
	public static void main(String[] args) {
		StringLength i = s -> s.length();
		int sLength = i.getLength("HelloWorld");
		System.out.println("String length is : " + sLength );
		
	}

}
