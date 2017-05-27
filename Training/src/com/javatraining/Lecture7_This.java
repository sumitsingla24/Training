package com.javatraining;

//this is used for current class operation
	class Student{  
		int rollno;  
		String name;
		String course;  
		float fee;  

		Student(int rollnumber,String name,String course){  
			this.rollno=rollnumber;  //this: to invoke current class instance variable
			this.name=name;  
			this.course=course;
			

		}  

		Student(int rollno,String name,String course,float fee){  
			this(rollno,name,course);//this: reusing constructor  
			this.fee=fee;
			this.display(); //this: to invoke current class method
			methodThis(this); //this: to pass as an argument in the method. Passing class instance
		}  

		void display(){
			System.out.println(rollno+" "+name+" "+course+" "+fee);
			}
		
		void methodThis(Student studentobj){
			studentobj.fee = 2000f;
			 System.out.println("method is invoked and printing fees: " + this.fee);
		}
		
		//return type is class and there u can use instance variable and other methods using this method when object is created of this class
		Student returnInstanceOfClass(){
			return this; 	//this: Used to return current class instance; Return type must be a Class
		}
	}  
	
	public class Lecture7_This {  
		public static void main(String args[]){  
			Student s1=new Student(111,"Amit","java");  
			Student s2=new Student(112,"Sumit","java",6000f);  
			s1.display();
			s1.returnInstanceOfClass().display();
			s2.display();
			s2.returnInstanceOfClass().display();
		}
}
