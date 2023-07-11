package com.testNG;

import org.testng.annotations.Test;

public class Features {
	
	@Test(priority = 2)
	public void higherstudies() {
		System.out.println("college name:MIT");
	}

	@Test(priority = 1)
	public void course() {
		System.out.println("course name:Engineering");
	}
	@Test()
	public void department() {
		System.out.println("department:Mechanical");
	}
	@Test(dependsOnMethods = "department")
	public void section() {
		System.out.println("section:B");
	}
}
