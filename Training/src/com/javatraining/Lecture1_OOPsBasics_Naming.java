package com.javatraining;

import org.apache.log4j.Logger;

//class name - First character should be Upper case then camel casing
public class Lecture1_OOPsBasics_Naming {
	
	static Logger log = Logger.getLogger(Lecture1_OOPsBasics_Naming.class.getName());
	static long  memoryCount = Runtime.getRuntime().totalMemory();
	static long  freeMemory = Runtime.getRuntime().freeMemory();
	long maxMemory = Runtime.getRuntime().maxMemory();
	public static final String TRAINING= "Java Language";
	
	Lecture1_OOPsBasics_Naming(){
		log.info("This is a default constructor");
	}
	
	public static void main(String[] args) {
		
		log.info("I want to learn " + TRAINING);
		
		Lecture1_OOPsBasics_Naming obj = new Lecture1_OOPsBasics_Naming();
		obj.memoryManagement();
		Lecture1_OOPsBasics_Naming.memoryManagementII(); // as method is static, instance of class not required
		memoryManagementII(); //same as previous line
	}

	
// method name - First character should be small case then camel casing
	public  void memoryManagement (){
		
	// public String localVar = "Won't be around for long" >> not allowed as method variables are local and not public

		String localVar = "Won't be around for long";
		log.info("In function: " + localVar);
		log.info("Max Memory: " + maxMemory);
	
		
		// localVar = null; //second way to dereference variable
	}
	
	
	public static void memoryManagementII (){
		
		log.info("Total Memory: " + memoryCount);
		log.info("Free Memory: " + freeMemory);	
	
		
	}
	
}
