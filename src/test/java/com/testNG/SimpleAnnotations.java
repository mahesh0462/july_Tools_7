package com.testNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SimpleAnnotations {
	public WebDriver driver;
	String url="http://adactinhotelapp.com/";
	@BeforeSuite
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("the setup process is completed");
	}
	@BeforeTest
	public void maxi() {
		driver.manage().window().maximize();
		System.out.println("the maxi process is completed");
	}
	@BeforeClass
	public void url() {
		driver.get(url);
		System.out.println("the url setup is completed");
	}
	@BeforeMethod
	public void checklogin() {
		driver.findElement(By.id("username")).sendKeys("mahe090909");
		driver.findElement(By.id("password")).sendKeys("mahesh090909");
		driver.findElement(By.id("login")).click();
		System.out.println("login process is completed");
	}
	@Test
	public void verifymainpage() {
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("verified the mainpage");
	}
	@AfterMethod
	public void gettittle() throws InterruptedException {
		String title = driver.getTitle();
		System.out.println(title);
		Thread.sleep(2000);
		
	}
	@AfterClass
	public void closeup() {
		driver.close();
		System.out.println("the closeup process is completed");
	}
	@AfterTest
	public void repoet() {
		System.out.println("report is ready");
	}
	@AfterSuite
	public void cleanup() {
		System.out.println("closeup activities completed");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
