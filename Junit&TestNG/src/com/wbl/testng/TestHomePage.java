package com.wbl.testng;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.wbl.main.HomePage;

public class TestHomePage {
	
	HomePage hp;
	
	@BeforeClass(alwaysRun=true)
	public void beforeClass(){
		 hp = new HomePage();	
	}
	
	@Test(groups={"smokeTest"})
	public void testLogin(){
		Assert.assertEquals("sucess",hp.login());
	}
	
	@Test(groups={"smokeTest"})
	public void testRecordings(){
		Assert.assertEquals("playing",hp.recordings());
	}
	
	@Test(groups={"functionalityTest","smokeTest"})
	public void testPresentation(){
		Assert.assertEquals(10,hp.presentations());
	}
	
	@Test(dependsOnGroups="smokeTest",alwaysRun=true)
	public void testLogout(){
		Assert.assertEquals("logout",hp.logout());
	}

}
