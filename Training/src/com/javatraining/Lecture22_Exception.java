package com.javatraining;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Lecture22_Exception {

	public static void main(String[] args) throws BiffException, IOException {

		try{  
			   int data=25/3;  
			   System.out.println(data);
			   //throw new ArithmeticException("Odd Number"); // throw keyword		   
			  }  
		
		catch(NullPointerException e){
				  System.out.println(e);
				
			  }
		
		//finally keyword
		finally{
			  System.out.println("finally block is always executed");
		  }
			  
		System.out.println("rest of the code...");  
		GetDataFromExcel excelObj = new GetDataFromExcel();
		excelObj.readExcel();
	}

}
class GetDataFromExcel {
	public List<String> emailList = new ArrayList<String>();
	
	public void readExcel() throws  IOException, BiffException {
		String FilePath = "C:\\Users\\s.singla\\Desktop\\Automation reference\\ClassRoom Training\\Java\\Testing.xls";
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);

		// TO get the access to the sheet
		Sheet sh = wb.getSheet("Testing");

		// To get the number of rows present in sheet
		int totalNoOfRows = sh.getRows();

		// To get the number of columns present in sheet
		int totalNoOfCols = sh.getColumns();

		for (int row = 0; row < totalNoOfRows; row++) {

			for (int col = 0; col < totalNoOfCols; col++) {
				System.out.print(sh.getCell(col, row).getContents() + "\t");
			}
			emailList.add(sh.getCell(1, row).getContents());
			System.out.println(emailList.get(row));
		}
		
	}

	
}