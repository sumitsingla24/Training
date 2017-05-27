package com.javatraining;

public class Lecture4_Operators {

	public static void main(String[] args) {
		
		unaryOperator();        //use of unary Operator
		arithmeticOperator();	//use of arithmetic Operator 
		shiftOperator();		//use of shift Operator
		logicalOperator();		//use of logical Operator
		bitwiseOperator();		//use of bitwise Operator
		assignmentOperator();	//use of assignment Operator
	}
	
	/** unaryOperator() method is used to show unary operations*/
	public static void unaryOperator(){
		int firstInt=10;
		int secondInt=-12;
		boolean boolTrue=true;
		boolean boolFalse=false;
		
		System.out.println("**Start of Unary Operators**");		
		System.out.println(firstInt++);//10 (11)  
		System.out.println(++firstInt);//12  
		System.out.println(firstInt--);//12 (11)  
		System.out.println(--firstInt);//10  
		
		System.out.println(~firstInt);//-11 (minus of total positive value which starts from 0)  
		System.out.println(~secondInt);//11 (positive of total minus, positive starts from 0)  
		System.out.println(!boolTrue);//false (opposite of boolean value)  
		System.out.println(!boolFalse);//true
		System.out.println("**End of Unary Operators**");
		System.out.println();
	}

	/** arithmeticOperator() method is used to show arithmetic operations*/
	public static void arithmeticOperator(){
		int firstInt=101;
		int secondInt=20;
		
		System.out.println("**Start of Arithmetic Operators**");		
		System.out.println(firstInt+secondInt);//121 
		System.out.println(firstInt-secondInt);//81
		System.out.println(firstInt*secondInt);//2020
		System.out.println(firstInt/secondInt);//5
		System.out.println(firstInt%secondInt);//1
		System.out.println("**End of Arithmetic Operators**");				
		System.out.println();
	}

	/** shiftOperator() method is used to show shift operations*/
	public static void shiftOperator(){
		
		System.out.println("**Start of Shift Operators**");
		//Left Shift
		System.out.println(10<<2);//10*2^2=10*4=40  
		System.out.println(10<<3);//10*2^3=10*8=80  
		System.out.println(20<<2);//20*2^2=20*4=80  
		System.out.println(15<<4);//15*2^4=15*16=240  
		
		//Right Shift
		System.out.println(10>>2);//10/2^2=10/4=2  
		System.out.println(20>>2);//20/2^2=20/4=5  
		System.out.println(20>>3);//20/2^3=20/8=2
		System.out.println("**End of Shift Operators**");
		System.out.println();
	}
	
	
	/** logicalOperator() method is used to show logical operations*/
	public static void logicalOperator(){
		 final String myFirstName="Sumit";
				
			System.out.println("**Start of Relational Operators**");
		
		//&& evaluates the left side of the operation, if it's true , it continues and evaluates the right side. 
		if( myFirstName != null && myFirstName.equals("Sumit")){
			System.out.println("Both Conditions are true");
			}  
		else {
			System.out.println("one Condition is false");
		}
		
		//The logical || operator doesn't check second condition if first condition is true. It checks second condition only if first one is false.
		if( myFirstName.isEmpty() || myFirstName.contentEquals("Sumit")){
			System.out.println("One Condition is true");
			}  
		else {
			System.out.println("Both Conditions are false");
		}
		
			System.out.println("**End of Relational Operators**");
			System.out.println();
	}
	
	/** bitwiseOperator() method is used to show bitwise operations*/	
	public static void bitwiseOperator(){
		final String myLastName="Singla";
		
		System.out.println("**Start of BitWise Operators**");
		
		//& is bitwise AND operator comparing bits of each operand. Evaluates both sides of the operation.
		if( myLastName != null & myLastName.equals("Singla")){
			System.out.println("Both Conditions are true");
			}  
		else {
			System.out.println("one Condition is false");
		}
		
		//The bitwise | operator always checks both conditions whether first condition is true or false.
		if( myLastName.isEmpty() | myLastName.contentEquals("Sumit")){
			System.out.println("One Condition is true");
			}  
		else {
			System.out.println("Both Conditions are false");
		}
		
		System.out.println("**End of BitWise Operators**");
		System.out.println();
	}
	
	/** assignmentOperator() method is used to show assignment operations*/	
	public static void assignmentOperator(){
		
		System.out.println("**Start of Assignment Operators**");
		int myInt=10;  
		int mySecondInt=20;  
		myInt+=4;//a=a+4 (a=10+4)  
		mySecondInt-=4;//b=b-4 (b=20-4)  
		System.out.println(myInt);  
		System.out.println(mySecondInt);  
		
		short a=10;  
		short b=10;  
		a=(short)(a+b);//20 which is int now converted to short  
		System.out.println(a);
		System.out.println("**End of Assignment Operators**");
	}
	
}
