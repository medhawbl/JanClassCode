package com.wbl.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.wbl.util.Constants;

import cucumber.api.java.Before;


public class WebUIDriver {
	
	protected WebDriver driver;
	
	@Before
	public void getDriver(){
		System.setProperty("webdriver.chrome.driver", Constants.RESOURCES + "/drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

}
