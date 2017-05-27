package com.javatraining;

import org.apache.log4j.Logger;


//immutable class
final class Employee {
	final String pancardNumber;  

	public Employee(String pancardNumber){  
	this.pancardNumber=pancardNumber;  
	}  

	public String getPancardNumber(){  
	return pancardNumber;  
	}
}

public class Lecture21_Immutable{
	private static Logger log = Logger.getLogger(Lecture21_Immutable.class.getName());
	
	public static void main (String[] args){
		Employee emp = new Employee("Passing String Value");
		log.info(emp.getPancardNumber());
	}
}
