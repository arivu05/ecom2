package org.java;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Airlines\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		/**File loc = new File("C:\\Users\\HP\\eclipse-workspace\\Airlines\\excel\\Book1.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("Book1");
		Row r = s.getRow(1);
		Cell c = r.getCell(0);
		System.out.println(c);**/
		
		driver.get("https://www.sportsmemorabilia.com/");
		//driver.manage().window().maximize();
		WebElement s = driver.findElement(By.id("3"));
		Actions acc = new Actions(driver);
		acc.moveToElement(s).perform();
		WebElement c = driver.findElement(By.xpath("//div[text()='Atlanta Hawks']"));
		c.click();
		List<WebElement> li = driver.findElements(By.xpath("//a[@data-talos='linkSearchResult']"));
		for (int i=0;i<li.size();i++) {
			li.get(4).click();	
		}
		//WebElement d = driver.findElement(By.xpath("(//a[@data-talos='linkSearchResult'])[2]"));
		//d.click();
		
		
		WebElement add = driver.findElement(By.xpath("//button[@class='button large primary']"));
		
		
		add.click();
		WebElement cart = driver.findElement(By.xpath("//div[@class='top-bar-cart']"));
		cart.click();
		WebElement checkout = driver.findElement(By.xpath("//button[@class='button large checkout-button primary']"));
		checkout.click();
		
		
		
	}
}