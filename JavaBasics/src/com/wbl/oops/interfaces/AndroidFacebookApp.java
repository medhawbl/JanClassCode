package com.wbl.oops.interfaces;

public class AndroidFacebookApp implements IFacebookApp{
	
	public String loginPage(){
		return "login success";
	}
	
	public String signUpPage(){
		return "sign up success";
	}
	
	public void notifications(){
		System.out.println("Notify new alerts");
	}
	
	public void friendRequests(){
		System.out.println("New freind request waiting");
	}
	

}
