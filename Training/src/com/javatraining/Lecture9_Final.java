package com.javatraining;

final class Vehicle2{}


class Vehicle{
	 final int SPEEDLIMIT=60;
	 final int SPEED;//blank final variable
	 static final int OVERSPEED; //blank static final variable
	 static{OVERSPEED=100;} // static final variable can be changed in static block
	 
	 Vehicle(){
		 SPEED = 30;  // final variable can be changed in constructor
		 System.out.println("Current Speed " + SPEED);
		 System.out.println("Current Speed " + OVERSPEED);
	 }
	 
	 void changeSpeed(){
		  //SPEEDLIMIT=100;  //final variable cannot be override
		 }
	 
	 final void run(){
		 System.out.println("running");
		 }
	 
	 void stop(final int i){
		 //i=i+2;				//final parameter cannot be override
		}
	 
}

/*class Car extends Vehicle{
	void run(){						//final method cannot be override
		System.out.println("stop"); 
	}
}*/

// final class cannot be extended
/*class Bike extends Vehicle2{
	void run(){System.out.println("running safely with 100kmph");}  
}*/

public class Lecture9_Final {

	public static void main(String[] args) {
		Vehicle obj=new Vehicle();  
		 obj.changeSpeed();

	}

}