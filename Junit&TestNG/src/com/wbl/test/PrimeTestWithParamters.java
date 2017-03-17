package com.wbl.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.wbl.main.PrimeNumber;

@RunWith(Parameterized.class)

public class PrimeTestWithParamters {
	boolean expectedOutput;
	int input;
	
	static PrimeNumber pm;
	
	public PrimeTestWithParamters(int input, boolean expectedOutput){
		this.input = input;
		this.expectedOutput = expectedOutput;		
	}
	
	
	@Parameters
	public static Collection dataForTest(){		
		Object[][] testData = {{5,true},{1,true},{10,false},{0,true}};
		return Arrays.asList(testData);
	}
	
	@BeforeClass
	public static void beforeClass(){
		pm = new PrimeNumber();
	}
	
	@Test
	public void testIsPrime(){
		assertEquals(expectedOutput,pm.isPrime(input));
	}
	
}
