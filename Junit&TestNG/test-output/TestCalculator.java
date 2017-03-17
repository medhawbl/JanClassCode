package com.wbl.testng;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.wbl.main.Calculator;

public class TestCalculator {
	
	@BeforeClass
	public void beforeClass(){
		System.out.println("This is from Before Class");
	}
	
	@AfterClass
	public void afterClass(){
		System.out.println("This is from After Class");
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("This is from Before method");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("This is from After method");
	}
	
	
	@Test
	public void testDoCalc(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(4.0, 2.0, '+');
		Assert.assertEquals(6.0, result);
	}
	
	@Test
	public void testDoCalc1(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(4.0, 2.0, '-');
		Assert.assertEquals(2.0, result);
	}
	
	@Test
	public void testDoCalc2(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(4.0, 2.0, '*');
		Assert.assertEquals(8.0, result);
	}
	
	@Test
	public void testDoCalc3(){
		Calculator calc = new Calculator();
		double result = calc.doCalc(4.0, 2.0, '/');
		Assert.assertEquals(2.0, result);
	}
	

	
}
