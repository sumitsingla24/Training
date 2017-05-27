package com.javatraining;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class Lecture17_HashMap {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(); 
		map.put("Karnataka", 100);
		map.put("Haryana", 200);
		map.put("Punjab", 300);
		map.put("Punjab", 400); // As Hashmap does not allow duplicate value 300 will be replaced with 400
		System.out.println("Printing HashMap:");
		System.out.println(map);
		
		// Get value of object key
		Integer intValue = map.get("Haryana");
		System.out.println("Value of Haryana is " + intValue);
		
		//Traversing map  
		for(Map.Entry<String, Integer> mapVar:map.entrySet()){
			String stringVal = mapVar.getKey();
			Integer intVal = mapVar.getValue();
			System.out.println(stringVal+" "+intVal);	
		}
		
		//Remove item of object key
		map.remove("Haryana");
		System.out.println(map);
		
		String statement = "The quick brown fox jumped over the lazy dogs.";
		checkDuplicate(statement);
		
	}
	
	//Finding no. of occurrence of each character in a String and putting the array in ascending order
	 private static void checkDuplicate(String statement){
		Map<Character,Integer> map = new TreeMap<Character,Integer>();
		for (int i = 0; i < statement.length(); i++) {
		  char c = statement.charAt(i);
		  if (map.containsKey(c)) {
		    int cnt = map.get(c);
		    map.put(c, ++cnt);
		  } else {
		    map.put(c, 1);
		  }
		}
		System.out.println(map);
	}

}