package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class MultipleData {

	public static void main(String[] args) throws IOException {
		
		
		
		File f = new File("C:\\Users\\pc\\eclipse-workspace\\project\\Excel\\Alldata.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheetAt = wb.getSheetAt(0);
		int numberOfRows = sheetAt.getPhysicalNumberOfRows();
		int numberOfCells = sheetAt.getRow(0).getPhysicalNumberOfCells();
		
		for(int i=0;i<numberOfRows;i++) {
			for(int j=0;j<numberOfCells;j++) {
				String value = sheetAt.getRow(i).getCell(j).getStringCellValue();
				System.out.println(value);
			}
		}
		wb.close();
		
		
	}
	
	
	
}
