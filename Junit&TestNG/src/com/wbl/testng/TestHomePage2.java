package com.wbl.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class TestHomePage2 {
	
	HomePage hp;
	
	@BeforeClass
	public void beforeClass(){
		 hp = new HomePage();	
	}
	
	@Test
	public void testLogin(){
		Assert.assertEquals("success",hp.login());
	}
	
	@Test(dependsOnMethods="testLogin", alwaysRun =true)
	public void testRecordings(){
		Assert.assertEquals("playing",hp.recordings());
	}
	
	@Test(dependsOnMethods="testLogin")
	public void testPresentation(){
		Assert.assertEquals(10,hp.presentations());
	}
	
	@Test(dependsOnMethods={"testLogin","testPresentation"})
	public void testLogout(){
		Assert.assertEquals("logout",hp.logout());
	}

}
