package com.javatraining;

import java.lang.reflect.Method;

public class Lecture14_class {

	public static void main(String[] args)  {
		
		Lecture1_OOPsBasics_Naming intObj = new Lecture1_OOPsBasics_Naming();
		Class<?> c= intObj.getClass();  // c datatyped as class
		
		System.out.println(c);
		System.out.println(c.getName()); // prints complete path including package name
		System.out.println(c.getSimpleName());
		
		//getting methods of class
		Method[] methods = c.getDeclaredMethods();
		Method method = methods[0];
		System.out.println(method.getName());
		
		//Understand if class is a Interface
		Class<?> c2 = Lecture13_Interface.class; //without instance of class
		System.out.println(c2.getSimpleName() + " Class is an Interface? "+ c2.isInterface());
		
		
	}

}
