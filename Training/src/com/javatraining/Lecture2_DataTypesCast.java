package com.javatraining;

import org.apache.log4j.Logger;

public class Lecture2_DataTypesCast {
	
/*  Primtive Data Types
	DataType:: is int
	Identifier:: is myNumber
	Value:: is 5  */
	
	int myNumber = 5; //instance variable
	static final String OUTPUTTEXT = "Converted double value ";
	static int myStaticNumber = 10; //static variable
	static Logger log = Logger.getLogger(Lecture1_OOPsBasics_Naming.class.getName());
	
	
	public static void main(String[] args) {
		
		double doubleValue = 135.2d; // local variable
		Double doubleObject = new Double(doubleValue);
		byte byteValue = doubleObject.byteValue();
		int invtVal = doubleObject.intValue();
		float floatVal = doubleObject.floatValue();
		String stringVal = doubleObject.toString(); //String is a Non Primitive Data Type
		
		log.info(OUTPUTTEXT + doubleValue + " to byte= " + byteValue);
		log.info(OUTPUTTEXT + doubleValue + " to int= " + invtVal);
		log.info(OUTPUTTEXT + doubleValue + " to float= " + floatVal);
		log.info(OUTPUTTEXT + doubleValue + " to string= " + stringVal);
		
		// Identifiers are case sensitive & defining their default values
		Integer myInt = null;
		int myint = 0;
		log.info("The value of myInt & myint is " + myInt + " "+ myint);
		
		//Type Cast
		float myFloat = 34.5f;
		int myInteger = (int)myFloat; //type cast from float to int
		log.info("The value of myFoat is " + myFloat);
		log.info("The value of myInteger is " + myInteger);
		
		// Calling conversion method
		conversion();
	}
	
	public static void conversion(){
		int myInt = 6;
		String myString = String.valueOf(myInt);
		String myStringII = Integer.toString(myInt);
		
		StringBuilder stringBuild = new StringBuilder(); // User of String Builder
		stringBuild.append("Integer converted to string ");
		stringBuild.append(myInt);
		String concString = stringBuild.toString();
		
		log.info("Int to String " + myString + myStringII);
		log.info(concString);
		
	}

}
