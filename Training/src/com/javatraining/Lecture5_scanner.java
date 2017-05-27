package com.javatraining;

import java.util.Scanner;

public class Lecture5_scanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); 
		
		System.out.println("Enter first number");
		int num1=sc.nextInt();

		System.out.println("Enter second number");
		int num2=sc.nextInt();
		
		System.out.println("Enter operation on numbers");
		String ops=sc.next();

		System.out.println(ops+" --> "+num1+","+num2);

	}

}
