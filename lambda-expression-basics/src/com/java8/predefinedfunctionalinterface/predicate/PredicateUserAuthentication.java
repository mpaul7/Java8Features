package com.java8.predefinedfunctionalinterface.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateUserAuthentication {
	
	public static void main(String[] args) {
		
		Predicate<User> p = user -> user.username.equals("mpaul") && user.pwd.equals("java");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username");
		String username = sc.next();
		System.out.println("Enter pwd");
		String pwd = sc.next();
		
		User user = new User(username, pwd);
		if(p.test(user)) { 
			System.out.println("Valid user");
		}
		else
		{
			System.out.println("Invalid user");
		}
		
	}

}
