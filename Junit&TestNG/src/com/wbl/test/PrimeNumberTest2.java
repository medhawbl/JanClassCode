package com.wbl.test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wbl.main.PrimeNumber;

public class PrimeNumberTest2 {

PrimeNumber pm;
	
@BeforeSuite
public static void beforeSuite(){
	System.out.println("This executes once ");
}

@AfterSuite
public static void afterSuite(){
	System.out.println("This executes once ");
}

@BeforeTest
public static void beforeTest(){
	System.out.println("This executes once before all tests ");
}

@AfterTest
public static void afterTest(){
	System.out.println("This executes once after all test");
}

	@BeforeClass
	public static void beforeClass(){
		System.out.println("This executes once before all methods ");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("This executes once after all methods");
	}

	@BeforeMethod
	public void before(){
		pm = new PrimeNumber();
		System.out.println("This executes before every method ");
	}
	
	@AfterMethod
	public void after(){
		System.out.println("this executes after every method");
	}

	@Test
	public void IsPrime(){
		boolean result = pm.isPrime(5);
		assertEquals(true, result);
	}
	
	@Test
	public void IsPrime1(){
		boolean result = pm.isPrime(1);
		assertEquals(false, result);
	}
	
	@Test
	public void testIsPrime2(){
		boolean result = pm.isPrime(10);
		assertEquals(false, result);
		assertFalse(result);
	}
	
	@Test
	public void testIsPrime3(){
		boolean result = pm.isPrime(0);
		assertTrue(result);
			
	}
	
	
	
}
