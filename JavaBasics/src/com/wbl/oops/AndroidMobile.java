package com.wbl.oops;

public  class AndroidMobile extends Mobile{

		public  void mobileNativeApp(){
			System.out.println("Android specific mobile app");
		}
		
		public  String browsers(){
			return "ChromeBrowser";
		}
		
		public  void appStore(){
			System.out.println("Android app store");
		}
		
		public void displayDetails(){
			System.out.println(color);
			System.out.println(brand);
		}
}
