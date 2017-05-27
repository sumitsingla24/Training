package com.javatraining;

/** Class having instance variable and methods */
class DiffClass{  
	 int rollno;  
	 String name;
	 
	 void insertRecord(int r, String n){  
		  rollno=r;  
		  name=n;  
		 }  
		 void displayInformation(){System.out.println(rollno+" "+name);}  
		}

/** Example how to Initialize Object via Constructor */
class InitializeObjectviaConstructor{
	public static void main(String args[]){  
		Lecture6_ConstructorClass cc=new Lecture6_ConstructorClass();
		Lecture6_ConstructorClass cc1=new Lecture6_ConstructorClass(111,"Sumit");  
		//Lecture6_ConstructorClass cc2 = new Lecture6_ConstructorClass();  
		//Lecture6_ConstructorClass cc3 = new Lecture6_ConstructorClass(222,"Amit");  
	    cc.display();  
	    cc1.display();  
	 }
}

/** Example how to Initialize Object via Method */
class InitializeObjectsviaMethods{  
	 public static void main(String args[]){  
		 DiffClass s1=new DiffClass();  
		 DiffClass s2=new DiffClass();  
	  s1.insertRecord(111,"Sumit");  
	  s2.insertRecord(222,"Amit");  
	  s1.displayInformation();  
	  s2.displayInformation();  
	 }  
	}

/** Example how to Initialize Object via Reference Variable */
	class Lecture6_InitializeObject{  
	 public static void main(String args[]){  
	  //Creating objects  
		 DiffClass dc1=new DiffClass();  
		 DiffClass dc2=new DiffClass();  
	  //Initializing objects  
	  dc1.rollno=101;  
	  dc1.name="Sumit";  
	  dc2.rollno=102;  
	  dc2.name="Amit";  
	  //Printing data  
	  System.out.println(dc1.rollno+" "+dc2.name);  
	  System.out.println(dc1.rollno+" "+dc2.name);  
	 }  
	}
	