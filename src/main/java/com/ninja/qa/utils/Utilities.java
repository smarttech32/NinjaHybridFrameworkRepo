package com.ninja.qa.utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Date;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Utilities {
	
		
	
	public static String generateEmailWithTimeStamp() {
		
		Date date = new Date();
		String timestamp = date.toString().replace("","_").replace(":","_");
		return "bennydeva1947"+timestamp+"@gmail.com";
	}
	
public static String generateTimeStamp() {
		
		Date date = new Date();
		String timestamp = date.toString().replace(""," ").replace(":"," ").replace("E D T","@").replace("2 0 2 4", "gmail.com").replace(" ", "");
		
		return timestamp;
}	


	public static Object[][] getTestDataFromExcel(String sheetName) {
		
		
		File excelFile = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\ninja\\qa\\testdata\\NinjaTestData.xlsx");
		XSSFWorkbook workbook = null ;
		try {
			FileInputStream fisExcel = new FileInputStream (excelFile);
		    workbook = new XSSFWorkbook(fisExcel);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		XSSFSheet sheet = workbook.getSheet(sheetName);
		
		int rows= sheet.getLastRowNum();
		int cols= sheet.getRow(0).getLastCellNum();
		
		Object[][] data= new Object[rows][cols];
		
		for(int i=0;i<rows;i++) {
			
			XSSFRow row = sheet.getRow(i+1);
			
			for(int j=0;j<cols;j++) {
				
				XSSFCell cell = row.getCell(j);
				CellType cellType = cell.getCellType();
				
				switch(cellType) {
				
				case STRING:
					data[i][j] = cell.getStringCellValue();
					break;
				case NUMERIC:
					data[i][j]= Integer.toString((int)cell.getNumericCellValue());
					break;
				
				case BOOLEAN:
					data[i][j]= cell.getBooleanCellValue();
					break;
					
				}
				
			}
			
			
		}
		return data;
	}
	
	
}
	


