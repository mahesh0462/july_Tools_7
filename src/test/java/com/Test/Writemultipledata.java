package com.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Writemultipledata {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		String s = sc.nextLine();
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		String s3 = sc.nextLine();
		String s4 = sc.nextLine();
		String s5 = sc.nextLine();
		String s6 = sc.nextLine();
		String s7 = sc.nextLine();
		String s8 = sc.nextLine();
		
		File f = new File("C:\\Users\\pc\\Desktop\\Writemultipledata.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		
		wb.createSheet("project1").createRow(0).createCell(0).setCellValue(s);
		wb.getSheet("project1").getRow(0).createCell(1).setCellValue(s1);
		wb.getSheet("project1").getRow(0).createCell(2).setCellValue(s2);
		wb.getSheet("project1").createRow(1).createCell(0).setCellValue(s3);
		wb.getSheet("project1").getRow(1).createCell(1).setCellValue(s4);
		wb.getSheet("project1").getRow(1).createCell(2).setCellValue(s5);
		wb.getSheet("project1").createRow(2).createCell(0).setCellValue(s6);
		wb.getSheet("project1").getRow(2).createCell(1).setCellValue(s7);
		wb.getSheet("project1").getRow(2).createCell(2).setCellValue(s8);
		
		
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
		System.out.println("success");
	
		wb.close();
	
	
	}

}
