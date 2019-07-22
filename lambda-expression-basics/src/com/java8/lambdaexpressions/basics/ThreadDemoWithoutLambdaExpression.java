package com.java8.lambdaexpressions.basics;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++)
			System.out.println("Child thread!");
	}
}

public class ThreadDemoWithoutLambdaExpression {
	
	public static void main(String[] args) {
		Runnable r = new MyRunnable();
		Thread t = new Thread(r);
		t.start();
		
		for (int i = 0; i < 10; i++)
			System.out.println("Main thread!");
	}
}
