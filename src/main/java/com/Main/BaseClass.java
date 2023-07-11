package com.Main;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	
	public static WebDriver driver;
	
		public static void browserLaunch(String type) {
			
			if (type.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
			}
			else if (type.equalsIgnoreCase("firefox")) {
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
			}	
		}
		public static void maxi() {
			driver.manage().window().maximize();
		}
		public static void urlLaunch(String url) {
			driver.get(url);
			
		}
		public static void inputValue(WebElement element,String name) {
			element.sendKeys(name);
		}
		public static void clickOnlement(WebElement ele) {
			ele.click();
		}
		
			
		public static void dropDown(WebElement element,String type, String value) {
			Select s = new Select(element);
			if (type.equals("value")) {
				s.selectByValue(value);	
			}else if (type.equals("index")) {
				int parseInt = Integer.parseInt(value);
				s.selectByIndex(parseInt);
			}else if (type.equals("text")) {
				s.selectByVisibleText(value);
			}
		}

		public static void dropDownGetOptions(WebElement element) {
			Select s = new Select(element);
			s.getOptions();
		}

		public static void dropDownGetFirstSelectedOption(WebElement element) {
			Select s = new Select(element);
			s.getFirstSelectedOption();
		}

		public static void dropDownGetAllSelectedOption(WebElement element) {
			Select s = new Select(element);
			s.getAllSelectedOptions();
		}

		public static void isMultiple(WebElement element) {
			Select s = new Select(element);
			s.isMultiple();
		}
		
		public static void clear(WebElement element) {
			element.clear();
		}
		
		
	}


