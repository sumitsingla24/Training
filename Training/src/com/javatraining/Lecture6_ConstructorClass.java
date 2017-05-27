package com.javatraining;

/** Class having default & parameterized constructor */
public class Lecture6_ConstructorClass {
	int rollno;  
	String name;
	static int count=0; //will get memory only once and retain its value
	
	static{System.out.println("Static Block is executed before Main Method");} 
	
	Lecture6_ConstructorClass(){
		System.out.println("ConstructorClass Object is created - Count = "+ count++);
		}
	Lecture6_ConstructorClass(int i, String s){
		 rollno = i;  
		 name = s;
		}
	
	void display(){System.out.println(rollno+" "+name);}
}
