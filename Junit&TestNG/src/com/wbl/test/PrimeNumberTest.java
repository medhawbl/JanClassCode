package com.wbl.test;

import com.wbl.main.PrimeNumber;

import junit.framework.TestCase;

public class PrimeNumberTest extends TestCase{
	PrimeNumber pm;
	
	public void setUp(){
		pm = new PrimeNumber();
		System.out.println("This executes before every method ");
	}
	
	public void tearDown(){
		System.out.println("this executes after every method");
	}

	public void testIsPrime(){
		boolean result = pm.isPrime(5);
		assertEquals(true, result);
	}
	
	public void IsPrime1(){
		boolean result = pm.isPrime(1);
		assertEquals(false, result);
	}
	
	public void testIsPrime2(){
		boolean result = pm.isPrime(10);
		assertEquals(false, result);
	}
	
	public void testIsPrime3(){
		boolean result = pm.isPrime(0);
		assertEquals(true, result);
	}
		
}
