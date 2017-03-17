package com.wbl.testng;

import java.util.List;

import org.testng.Assert;
import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.xml.XmlSuite;

public class TestBasicString implements IReporter{
	
	/*@Parameters({"input","input1"})
	@Test
	public void test2(String greet, String greet1){
			
		//BasicString bs = new BasicString();
		//bs.stringBasic("Hello");
		System.out.println(greet);
		System.out.println(greet1);
		Assert.assertEquals(greet, "Hello World");
		Assert.assertEquals(greet1, "Hello World, how are ypu today");
		System.out.println("Lines before the assert stmt...");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(5>10);
		Assert.assertEquals("Hello", "Hello");
		System.out.println("Lines after the assert stmt...");
	}
	
	@Test
	public void test3(){
		System.out.println("Method after the assert stmt...");
	}*/

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		
		System.out.println("Lines before the assert stmt...");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(5>10);
		Assert.assertEquals("Hello", "Hello");
		System.out.println("Lines after the assert stmt...");
	}
	
}
