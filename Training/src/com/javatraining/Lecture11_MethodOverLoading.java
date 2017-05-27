package com.javatraining;

class Adder{  

	static int add(int a,int b){
		System.out.println("Method with 2 int parameters");
		return a+b;
	}  

	static int add(int a,int b,int c){ //Method Overloading: changing no. of arguments
		System.out.println("Method with 3 int parameters");
		return a+b+c;
	}
	
	static double add(double a, double b){ //Method Overloading: changing data type of arguments
		System.out.println("Method with double return type and 2 double parameters");
		return a+b;
	}
	
	/*static double add(int a,int b) { //Method Overloading is not possible by changing the return type of method only
		return a+b;
		} */
	
	//Method Overloading with Type Promotion if matching found
	static long add(long a,long b){
		System.out.println("Method with long returntype and 2 long parameters");
		return a+b;
	}
}  

public class Lecture11_MethodOverLoading {

	public static void main(String args[]){  
		
		System.out.println(Adder.add(11,11));  
		System.out.println(Adder.add(11,11,11));
		System.out.println(Adder.add(11.2d,14.4d));
		System.out.println(Adder.add(11,22l));
		main("main overloaded");
		main();
	}
	
	//You can have any number of main methods in a class by method overloading.
	public static void main(String args){
		System.out.println(args);
		}  
	
	public static void main(){
		System.out.println("main without args");
		}  
}
