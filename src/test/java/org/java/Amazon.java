package org.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {
	public static void main(String[] args) throws IOException {
		 //System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Airlines\\driver\\chromedriver.exe");
		// WebDriver driver = new ChromeDriver();
		
		File loc = new File("C:\\Users\\HP\\eclipse-workspace\\Airlines\\excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Book1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);
		
		
	}
}