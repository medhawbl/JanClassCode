package com.wbl.oops;

public class IOSMobile extends Mobile{

		public  void mobileNativeApp(){
			System.out.println("IOS specific mobile app");
		}
		
		public  String browsers(){
			return "SAFARIBrowser";
		}
		
		public  void appStore(){
			System.out.println("IOS app store");
		}
		
		public void displayDetails(){
			System.out.println(color);
			System.out.println(brand);
		}
		
		public static void mobileWebApp(){
			System.out.println("This is common for IOS and Android");
		}
		/*
		public final String getBrand() {
			return brand;
		}
		 */

}
