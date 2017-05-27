package com.wbl.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public String login(String uname, String pwd){
		driver.findElement(By.name("email")).sendKeys(uname);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.cssSelector("[type='submit']"));
		return driver.getTitle();
	}

}
