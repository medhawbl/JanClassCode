package com.wbl.oops;

public class MobileBasic {
	
	//properties - variables
	public String brand;
	public String color;
	public String model;
	public int price;
	
	//actions - methods
    public void	calls(){
      System.out.println("Call and communicate");
    }
    
    public String messaging(String inputMessage,int phoneNumber){
    	System.out.println("messaging to "+phoneNumber);
    	System.out.println(inputMessage);
    	String outputMessage = "This is my reply";
    	return outputMessage;
    }
    
	public void browsing(String url){
		System.out.println("Browsing "+url);
	}
	
	public String usingApps(){
		System.out.println("Installing apps");
		String output="success";
		return output;
	}

	public void displayDetails(){
		System.out.println("brand is : "+brand);
		System.out.println("color is : "+color);
		System.out.println("price is : "+price);
		System.out.println("model is : "+model);
	}
}
