package com.javatraining;


//By implementing Cloneable interface we make sure that instances of class A can be cloned.

class ABC implements Cloneable {
 int i;
 String s;

public ABC(int i,String s) { 
     this.i = i;
     this.s = s; 
     }

public void printOut (){
	System.out.println("Printing");
}

 @Override
 // Overriding clone() method by simply calling Object class clone() method.
 // Note that this interface does not contain the clone method. 
//A class implements the Cloneable interface to indicate to the Object.clone() method that it is legal for that method to make a field-for-field copy of instances of that class. 
 protected Object clone() throws CloneNotSupportedException{
     return super.clone(); 
     }
 
 public void display(){
	 System.out.println("incremented by 1 " + ++i);
 }
 }

public class Lecture13_Cloneable {

	public static void main(String[] args) throws CloneNotSupportedException {
	
		ABC objA = new ABC(20, "GeeksForGeeks");
        
        // cloning 'a' and holding new cloned object reference in b down-casting as clone() return type is Object
		ABC objB = (ABC)objA.clone();
 
        System.out.println(objB.i);
        System.out.println(objB.s);
        objB.printOut();
        
        if (objB.getClass() == objA.getClass()){
        	System.out.println("ObjB is a copy of ObjA :" + objB.getClass().toString());
        	
        }
        else{
        	System.out.println("ObjB is Not a copy of ObjA");
        }
        objA.display();
        objB.display();	
         
	}

}
