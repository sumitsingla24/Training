package com.seleniumtraining;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Lecture3_TestNGAnnotations {

	@Test(priority = 2, dataProvider="dataProvidor")
	public void printStuff(String username, String password, Integer age){
		System.out.println(username+" "+password+" "+age);
	}
	
	@DataProvider(name="dataProvidor")
	public Object[][] getData()
	{
		//Rows - Number of times your test has to be repeated.
		//Columns - Number of parameters in test data.
		Object[][] data = new Object[2][3];
		
		data[0][0]="sumitsingla.24@gmail.com";
		data[0][1]="abc";
		data[0][2]=10;

		data[1][0]="contactus@gmail.com";
		data[1][1]="1234";
		data[1][2]=10;
		return data;
	}

}
