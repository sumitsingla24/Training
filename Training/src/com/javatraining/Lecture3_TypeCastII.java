package com.javatraining;

import java.util.HashMap;
import java.util.Map;

//Type Cast Example for WebSites
public class Lecture3_TypeCastII {

	Lecture3_TypeCastII(){
		
	}
	
	public static void main(String[] args) {

		Map<String,String> model=new HashMap<String,String>();
		model.put("name", "Sumit Singla");
		model.put("email", "sumitsingla.24@gmail.com");
		model.put("birthday", "24-06-1984");
		
		String[] dateUnits = ((String)model.get("birthday")).split("-");
		 
		Integer day = Integer.valueOf(dateUnits[0]); //type cast
		Integer month = Integer.valueOf(dateUnits[1]);
		Integer year = Integer.valueOf(dateUnits[2]);
		 
		String name = model.get("name");
		String email = model.get("email");
		
		System.out.println("Year = " + year);
		System.out.println("Month = " + month);
		System.out.println("Date = " + day);
		System.out.println("Name = " + name);
		System.out.println("Email = " + email);

	}

}
