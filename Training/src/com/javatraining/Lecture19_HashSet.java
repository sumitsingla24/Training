package com.javatraining;

import java.util.HashSet;
import java.util.Set;

public class Lecture19_HashSet {

	public static void main(String[] args) {
		Bank bankobj = new AXIS();
		Bank bankobj2 = new ICICI();
		Bank bankobj3 =new SBI();
		
		Set<Bank> hashSet = new HashSet<>();
		
		hashSet.add(bankobj);
		hashSet.add(bankobj); //if I try to add an object again it'll be ignored. 
		hashSet.add(bankobj2);
		hashSet.add(bankobj3);
		hashSet.add(null);  // null is also an object for hashSet
		
		System.out.println("Size of HashSet is " + hashSet.size());
		
		//remove object from HashSet
		hashSet.remove(bankobj2);
		System.out.println("Size of HashSet is " + hashSet.size());
		
	}

}
