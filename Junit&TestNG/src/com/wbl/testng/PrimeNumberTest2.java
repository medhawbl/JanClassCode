package com.wbl.testng;

import static junit.framework.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.wbl.main.PrimeNumber;

public class PrimeNumberTest2 {

PrimeNumber pm;
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("This executes once before all methods ");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("This executes once after all methods");
	}

	@Before
	public void before(){
		pm = new PrimeNumber();
		System.out.println("This executes before every method ");
	}
	
	@After
	public void after(){
		System.out.println("this executes after every method");
	}

	@Test
	public void IsPrime(){
		boolean result = pm.isPrime(5);
		assertEquals(true, result);
	}
	
	@Ignore
	@Test
	public void IsPrime1(){
		boolean result = pm.isPrime(1);
		assertEquals(false, result);
	}
	
	@Test
	public void testIsPrime2(){
		boolean result = pm.isPrime(10);
		//assertEquals(false, result);
		Assert.assertFalse(result);
	}
	
	@Test(timeout = 200)
	public void testIsPrime3(){
		boolean result = pm.isPrime(0);
		//assertEquals(true, result);
		Assert.assertTrue(result);
			
	}
	
	
	
}
