package com.wbl.test;

import com.wbl.oops.MobileBasic;

public class MobileTest {
	
	public static void main(String args[]){
		
		//create object of Mobile class
		MobileBasic mobileObject= new MobileBasic();
		
		mobileObject.calls();
		mobileObject.browsing("http:://google.com");//passing string as input to method
		
		String output= mobileObject.messaging("Hello Java",373298789);//passing input parametyers when we are calling methods
		System.out.println("return result:"+output);
		
		mobileObject.usingApps();
		
		mobileObject.brand="Samsung";
		mobileObject.color="black";
		mobileObject.model="galaxy s3";
		mobileObject.price=150;
		
		mobileObject.displayDetails();
		
	}

}
