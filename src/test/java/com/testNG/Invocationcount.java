package com.testNG;

import org.testng.annotations.Test;

public class Invocationcount {

	@Test(invocationCount = 3)
	public void degree() {
		System.out.println("degree:BE");
	}
	
	@Test(timeOut = 2000)
	public void name() throws InterruptedException {
		//Thread.sleep(3000);
		System.out.println("name:mahesh");
	}
	
	@Test(expectedExceptions = Exception.class)
	public void marks() {
		@SuppressWarnings("unused")
		int a=20/0;
	}
	
	
	
	
}


