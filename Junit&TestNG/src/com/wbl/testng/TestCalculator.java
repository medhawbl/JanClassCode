package com.wbl.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.wbl.main.Calculator;

public class TestCalculator {
	
	@DataProvider(name= "testdata")
	public Object[][] getdata(){
		Object[][] data = {{2.0,4.0,'+',6.0},{2.0,4.0,'-',-2.0},{2.0,4.0,'*',8.0}};
		return data;
	}
	
	@Test(dataProvider="testdata")
	public void testCalc(double a, double b, char ch, double result ){
		Calculator cal = new Calculator();
		double res = cal.doCalc(a,b,ch);
		Assert.assertEquals(res,result);
	}

}
