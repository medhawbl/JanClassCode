package com.wbl.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class TestHomePage4 {

HomePage hp;
	
	@BeforeClass(alwaysRun=true)
	public void beforeClass(){
		 hp = new HomePage();	
	}
	
	@Test(priority=0)
	public void testLogin(){
		Assert.assertEquals("success",hp.login());
	}
	
	@Test(priority=1)
	public void testRecordings(){
		Assert.assertEquals("playing",hp.recordings());
	}
	
	@Test(priority=2)
	public void testPresentation(){
		Assert.assertEquals(10,hp.presentations());
	}
	
	@Test(priority=3)
	public void testLogout(){
		Assert.assertEquals("logout",hp.logout());
	}
	
}
