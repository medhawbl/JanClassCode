package com.wbl.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class TestHomePage3 {
	
	HomePage hp;
	
	@BeforeClass
	public void beforeClass(){
		 hp = new HomePage();	
	}
	
	/*@Test(invocationCount = 20, threadPoolSize=5, invocationTimeOut=300)
	public void testLogin() throws InterruptedException{
		Thread.sleep(400);
		System.out.println("Hello There!!! ");
	}*/

	
	@Test(enabled=true)
	public void test() throws InterruptedException{
		Thread.sleep(2000);
		System.out.println("Sys timeout");
		
	}
	
	
}
