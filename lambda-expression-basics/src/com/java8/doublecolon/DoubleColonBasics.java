package com.java8.doublecolon;

interface Interf{
	public void m1();
}

interface ISample{
	public Sample get();
}

class Sample {
	
	Sample(){
		System.out.println(" Sample constructor using constructor reference");
	}
}

 class Test {
	public static void m2() {
		System.out.println(" Implementation by Method Reference");
	}
	
	public void m3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}

public class DoubleColonBasics {
	
	public static void main(String[] args) {
		
		/*
		 * In Java 8 Dobule Colon (::) operaotr is used for
		 * Method reference
		 * Constructor reference
		 */
		
		// ===== Method Reference ========
		/*
		 * Syntex for Method Reference
		 * Static Method
		 * =============
		 * classname :: method name
		 * 
		 * Instance method
		 * ===============
		 * ObjectRef :: method name
		 * 
		 * 
		 */
		
		Interf i = Test :: m2;
		i.m1();
		
		
		// Thread implementation using method reference
		Test t = new Test();
		Runnable r = t :: m3;
		Thread t1 = new Thread(r);
		t1.start();
		
		// ===== Constructor Reference ======
		
		ISample m = ()-> {Sample s = new Sample();
				return s;};
				
				Sample s2 = m.get();
				
				// with doublecolon 
				
				ISample dc = Sample :: new;
				Sample s4 = dc.get();
	}

}
