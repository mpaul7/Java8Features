package com.java8.predefinedfunctionalinterface.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierBasics {

	public static void main(String[] args) {


		Supplier<Date> s = () -> new Date();
		System.out.println(s.get());
		
		//==============================
		
		Supplier<String> s2 = () -> {
		String[] s1 = {"a", "b", "c", "d"};
		
		
		int x = (int)(Math.random() * 4);
		return s1[x];
		};
		
		System.out.println(s2.get());
		System.out.println(s2.get());
		
		// ==========================
		
		Supplier<String> s3 = () -> {
			String otp = "";
			for (int i = 0; i< 6; i++) {
				otp = otp + (int)(Math.random() *10);
			}
			return otp;
		};
		
		System.out.println(s3.get());
		System.out.println(s3.get());
		
		//===============================
		
		Supplier<String> s4 = () -> {
			String pwd = "";
			Supplier<Integer> d = () -> (int)(Math.random() * 10);
			String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$";
			Supplier<Character> c = () -> symbols.charAt((int)(Math.random()*29));
			for (int i = 1; i <= 8; i++) {
				if (i %2 ==0){
					pwd = pwd + d.get();
				}
				else {
					pwd  = pwd + c.get();
				}
			}
			return pwd;
		};

		System.out.println(s4.get());
	}

}
