package com.wbl.oops.interfaces;

public class IOSFacebookApp implements IFacebookApp,IFacebookVideoCalling {
	
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

	@Override
	public void videoChat() {
		
	}

	@Override
	public void vidoMessages() {
	}

}
