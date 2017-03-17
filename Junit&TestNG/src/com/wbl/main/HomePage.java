package com.wbl.main;

public class HomePage {
	
	public String login(){
		//webdriver code to give login login details and capture the output
		System.out.println("Enter login credentials, in login page");
		return "success";		
	}
	
	public String recordings(){
		System.out.println("All tha recordings are playing");
		return "playing";
	}
	
	public int presentations(){
		System.out.println("Counting the number of presebntations");
		return 10;
	}
	
	public String logout(){
		System.out.println("Successfull log out");
		return "logout";
	}
}
