package com.javatraining;

public abstract class Lecture12_AbstractClass {
	int speed = 90;
	   Lecture12_AbstractClass(){System.out.println("bike is created");}  
	   abstract void run();  
	   void changeGear(){System.out.println("gear changed");}  
	 }  
	  
	 class Honda extends Lecture12_AbstractClass{
		int speed = 120;
		void run(){System.out.println("running safely..");}  
	 }  
	 