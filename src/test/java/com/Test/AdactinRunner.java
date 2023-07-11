package com.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Main.BaseClass;

public class AdactinRunner extends BaseClass {

	

	public static void main(String[] args) {

		browserLaunch("chrome");
		maxi();
		urlLaunch("https://adactinhotelapp.com/index.php");
		
		WebElement user = driver.findElement(By.id("username"));
		inputValue(user, "mahe090909");
		WebElement pass = driver.findElement(By.id("password"));
		inputValue(pass, "mahesh090909");
		WebElement login = driver.findElement(By.id("login"));
		clickOnlement(login);
		WebElement location = driver.findElement(By.id("location"));
		dropDown(location, "index", "1");
		WebElement hotels = driver.findElement(By.id("hotels"));
		dropDown(hotels, "value", "Hotel Sunshine");
		WebElement room = driver.findElement(By.id("room_type"));
		dropDown(room, "text", "Double");
		WebElement rno = driver.findElement(By.id("room_nos"));
		dropDown(rno, "text", "4 - Four");
		WebElement checkin = driver.findElement(By.id("datepick_in"));
		clear(checkin);
		inputValue(checkin, "20/06/2023");
		WebElement checkout = driver.findElement(By.id("datepick_out"));
		clear(checkout);
		inputValue(checkout, "25/06/2023");
		WebElement adults = driver.findElement(By.id("adult_room"));
		dropDown(adults,"text", "2 - Two");
		WebElement child = driver.findElement(By.id("child_room"));
		dropDown(child, "value", "1");
		WebElement search = driver.findElement(By.id("Submit"));
		clickOnlement(search);
		WebElement click = driver.findElement(By.id("radiobutton_0"));
		clickOnlement(click);
		WebElement con = driver.findElement(By.id("continue"));
		clickOnlement(con);
		WebElement name = driver.findElement(By.id("first_name"));
		inputValue(name, "mahesh");
		WebElement lastname = driver.findElement(By.id("last_name"));
		inputValue(lastname, "kumar");
		WebElement add = driver.findElement(By.id("address"));
		inputValue(add, "3070,anna nagar,chennai,tamilnadu,india");
		WebElement card = driver.findElement(By.id("cc_num"));
		inputValue(card, "8523978436412089");
		WebElement cardtype = driver.findElement(By.id("cc_type"));
		dropDown(cardtype, "text", "Master Card");
		WebElement cmonth = driver.findElement(By.id("cc_exp_month"));
		dropDown(cmonth, "value", "4");
		WebElement cyear = driver.findElement(By.id("cc_exp_year"));
		dropDown(cyear, "text", "2025");
		WebElement cvv = driver.findElement(By.id("cc_cvv"));
		inputValue(cvv, "987");
		WebElement book = driver.findElement(By.id("book_now"));
		clickOnlement(book);
		
		
		
		
		
	}
}
