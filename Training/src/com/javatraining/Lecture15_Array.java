package com.javatraining;

import java.util.Arrays;

public class Lecture15_Array {

	static void minimumVal(int[] arr){  
		int min=arr[0];  
		for(int i=1;i<arr.length;i++)  
		 if(min>arr[i])  
		  min=arr[i];  
		  
		System.out.println("Min value of Array is " + min);  
		}
	
	public static void main(String[] args) {

		// Integer Array
		int intArray[]={33,3,4,5}; // brackets against array name or data type
		int[] intArray2 = {3,4,545,26,2,5,1,33}; //The array is not re-sizable.
				
		minimumVal(intArray);
		System.out.println("Array lenght " + intArray2.length); // Calculate length of Array
		Arrays.sort(intArray2); // sorting an array
		
		//Printing Array
		for (int i: intArray2) //for(declaration : expression)
		{ 
			System.out.println("Array printed in Ascending order " + i);
		}
		
		/*Declaration − The newly declared block variable, is of a type compatible with the elements of the array you are accessing.
	     *The variable will be available within the for block and its value would be the same as the current array element.
		 *Expression − This evaluates to the array you need to loop through.
		 *The expression can be an array variable or method call that returns an array.*/

		// Assigning value to Array in a loop
		int[] sizedArray = new int[10]; //array starts with int[0] goes to int[9] for array size of 10
		System.out.println("Array lenght of sizedArray " + sizedArray.length); // Calculate length of Array
		for(int i=0; i < sizedArray.length; i++ ){
			sizedArray[i] = i*100;
			System.out.println("Assigning and Printing value of Sized Array " + sizedArray[i] );
		}
		
		// Copy array
		
		int[] copied = new int[5];
		System.arraycopy(sizedArray, 6, copied, 0, 3); //6 is that start index of sizedArray, 0 & 3 are start and end index of copied
		for(int i:copied){
			System.out.println(i);
		}
		// String Array
		String[] strArray = {"White", "Yellow", "Blue"}; // String Array
		for (String iterator:strArray){
			System.out.println("Printing String Array value = " + iterator);
		}
		
		
		
	}
}

  
