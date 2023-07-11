package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adactin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\pc\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		WebElement user = driver.findElement(By.id("username"));
		user.sendKeys("mahe090909");
		WebElement pass = driver.findElement(By.id("password"));
		pass.sendKeys("mahesh090909");
		WebElement log = driver.findElement(By.id("login"));
		log.click();
		WebElement loc = driver.findElement(By.id("location"));
		Select s = new Select(loc);
		s.selectByIndex(2);
		WebElement hot = driver.findElement(By.id("hotels"));
		Select s1 = new Select(hot);
		s1.selectByValue("Hotel Sunshine");
		WebElement rt = driver.findElement(By.id("room_type"));
		Select s2 = new Select(rt);
		s2.selectByVisibleText("Deluxe");
		WebElement rn = driver.findElement(By.id("room_nos"));
		Select s3 = new Select(rn);
		s3.selectByIndex(2);
		WebElement chkin = driver.findElement(By.id("datepick_in"));
		chkin.clear();
		chkin.sendKeys("15/05/2023");
		WebElement chko = driver.findElement(By.id("datepick_out"));
		chko.clear();
		chko.sendKeys("18/05/2023");
		WebElement ar = driver.findElement(By.id("adult_room"));
		Select s4 = new Select(ar);
		s4.selectByIndex(3);
		WebElement cr = driver.findElement(By.id("child_room"));
		Select s5 = new Select(cr);
		s5.selectByIndex(0);
		WebElement ser = driver.findElement(By.id("Submit"));
		ser.click();
		WebElement clc = driver.findElement(By.xpath("//input[@type='radio']"));
		clc.click();
		WebElement cnt = driver.findElement(By.id("continue"));
		cnt.click();
		WebElement fn = driver.findElement(By.id("first_name"));
		fn.sendKeys("mahesh");
		WebElement ln = driver.findElement(By.id("last_name"));
		ln.sendKeys("s");
		WebElement add = driver.findElement(By.id("address"));
		add.sendKeys("3070A,14thmain road,anna nagar,chennai");
		WebElement carn = driver.findElement(By.id("cc_num"));
		carn.sendKeys("9632785274590214");
		WebElement cty = driver.findElement(By.id("cc_type"));
		Select s6 = new Select(cty);
		s6.selectByVisibleText("Master Card");
		WebElement mnt = driver.findElement(By.id("cc_exp_month"));
		Select s7 = new Select(mnt);
		s7.selectByIndex(4);
		WebElement year = driver.findElement(By.id("cc_exp_year"));
		Select s8=new Select(year);
		s8.selectByValue("2027");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		cvv.sendKeys("098");
		WebElement bn = driver.findElement(By.id("book_now"));
		bn.click();
	}

}
