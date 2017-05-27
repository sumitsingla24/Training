package com.javatraining;


	class Bank{  
		int getRateOfInterest(){
			return 0;
			}  
	}  
  
	class SBI extends Bank{  
		int getRateOfInterest(){	//Method Overriding
			return 8;
			}  
	}  
  
	class ICICI extends Bank{  
		int getRateOfInterest(){	//Method Overriding
			return 7;
			}  
	}  

	class AXIS extends Bank{  
		int getRateOfInterest(){	//Method Overriding
			return 9;
			}  
	}  
  

public	class Lecture10_Inheritance{  
		
		public static void main(String args[]){  
			SBI s=new SBI();  
			ICICI i=new ICICI();  
			AXIS a=new AXIS();  

			System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());  
			System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());  
			System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());  
			
			//Testing Covariant Return Type
			ClassB classB = new ClassB();
			classB.method1().message();
	}  
}

// Example of Covariant Return Type - Method Overiding by changing Return type if it Non-Primitive
class ClassA {

	ClassA method1() {
		return this;
	}
	
	void message(){
		System.out.println("This is Class A Method");
	}
	
}

class ClassB {

	ClassB method1() {
		return this;
	}
	
	void message(){
		System.out.println("This is Class B Method");
	}
	
}
