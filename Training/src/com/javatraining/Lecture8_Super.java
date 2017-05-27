package com.javatraining;

class StudentDetails{  
	int rollno;  
	String name;
	String course;  
	float fee;  

	StudentDetails(){
		rollno =10;
		name = "Sumit";
		course = "chemistry";
		fee = 2000;
		System.out.println("Calling Parent Class Defalut Constructor");
	}
	
	StudentDetails(int rollno,String name,String course){  
		this.rollno=rollno;  //this: to invoke current class instance variable
		this.name=name;  
		this.course=course;
	}  

	void display(){
		System.out.println(rollno+" "+name+" "+course+" "+fee);
		}
}

class TenthStandard extends StudentDetails{
	
	TenthStandard(){
		super(); //super: used to invoke parent class constructor. ALWAYS USE IT TO INITIATE CONSTRUCTOR OF SUPER CLASS
	}

	void printDetails(){
		System.out.println("Student Name from Parent Class :: " + super.name); //super: used to invoke parent class instance variable
		super.display(); //super: used to invoke parent class method
	}
}

class Lecture8_Super {  
	public static void main(String args[]){  
		TenthStandard ts=new TenthStandard();  
		ts.printDetails();
		
	}
}