package com.testNG;

import org.testng.annotations.Test;

public class Groups {
	
	@Test(groups = "b")
	public void name() {
		System.out.println("name:mahesh");
	}
	@Test(groups = "a")
	public void age() {
		System.out.println("age:28");
	}
	@Test(groups = "a")
	public void place() {
		System.out.println("place:chennai");
	}
	@Test(groups = "b")
	public void date() {
		System.out.println("date:14/6/2023");
	}

}
