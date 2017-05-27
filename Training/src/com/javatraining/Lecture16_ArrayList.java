package com.javatraining;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lecture16_ArrayList {

	static List<String> stringList = new ArrayList<>();
	static List<Integer> intList = new ArrayList<>(2);
	
	public static void main(String[] args) {
		
		/* List is the Interface
		 * ArrayList is the implemented class
		 * Diamond operator <> is called generic notations - it tells type of item it contains
		 * The constructor method is used for the ArrayList class, not for the List interface.
		 * While it's possible to create an instance of a interface, you would have to completely implement all of its code.
		 * An ArrayList contains an ordered collection of data. You could think of it as a re-sizable array.
		 * When you declare the ArrayList, you can declare it with a constructor with no values, and then the ArrayList will grow as needed.
		 * When creating a new ArrayList using the empty constructor, the list is constructed with an initial capacity of ten.
		 * If you already know how many items you're going to add to the list, you can pass in an integer value.
		 * And that will result in more efficient allocation of memory.
		 * Also notice that you don't have to pass in the data type of the items again. */
		
		//Adding Item to the list
		stringList.add("Sumit");
		stringList.add("Amit");
		stringList.add("Jyoti");
		
		System.out.println(stringList);		
		
		stringList.add("Singla");
		System.out.println(stringList);
		
		//Adding Item to the list2
		System.out.println("Size of the intList is " + intList.size());
		intList.add(100);
		intList.add(200);
		intList.add(300);
		intList.add(400);
		System.out.println(intList);
		
		// It’s also possible to construct a list that takes elements from an existing collection
		List<Integer> intList2 = new ArrayList<>(intList); 
		System.out.println("Size of the intList2 is " + intList2.size());
		System.out.println("Value of intList2 " + intList2);
		
		// 2nd Example to construct a list that takes elements from an existing collection
		List<Integer> intList3 = new ArrayList<>();
		intList3.addAll(intList2);
		System.out.println("Size of the intList3 is " + intList3.size());
		System.out.println("Value of intList3 " + intList3);
		
		//3rd example to construct a list that takes elements from an existing collection at a specific position
		List<Integer> intList4 = new ArrayList<>();
		intList4.add(24);
		intList4.addAll(1,intList3); //index 0 is 24 and intList3 will be added from index 1
		System.out.println("Size of the intList4 is " + intList4.size());
		System.out.println("Value of intList4 " + intList4);
		
		//Object Clone
		@SuppressWarnings("rawtypes")
		List intList5 = ((List) ((ArrayList) intList4).clone());
		System.out.println("Value of intList5 " + intList5);
		
		// Removing Item from the list
		stringList.remove(1);
		System.out.println(stringList);
		
		// Retrieving Value from a List
		String getValue = stringList.get(1);
		System.out.println("Second Value is " + getValue);
		
		// Retrieving the index value of list member
		int intValue = stringList.indexOf(getValue);
		System.out.println("Second Value is " + intValue);
		
		//looping through collection using while loop
		Iterator<String> iterator= stringList.iterator();
		while(iterator.hasNext()){		// hasNext returns the element and moves the cursor pointer to the next element.
			System.out.println("Value of String ArrayList " + iterator.next()); //next returns the element and moves the cursor pointer to the next element.
			
		//looping through collection using for loop			
		for(String stringLoop: stringList){
			System.out.println("Value of String ArrayList " + stringLoop);
		}
	}
		
}

}
