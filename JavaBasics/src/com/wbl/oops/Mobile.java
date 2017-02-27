package com.wbl.oops;

public abstract class Mobile {
	
	public String brand;
	public String color;
	
	
	
	//abstract methods- which do not have method body/implementation
	public abstract void mobileNativeApp();
	
	public abstract String browsers();
	
	public abstract void appStore();
	
	//concrete methods- which have method body/implementation
	public static void mobileWebApp(){
		System.out.println("This is common for IOS and Android");
	}

	public final String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	

}
