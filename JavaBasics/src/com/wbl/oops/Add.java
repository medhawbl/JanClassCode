package com.wbl.oops;

public class Add {
	
	String greet;
	
	public Add(String greet){
	this.greet = greet;
	System.out.println("hello constructor");
	}
	
	public Add(int i){
		System.out.println("hello constructor");
	}
		
	public Add(int i,int j){
		System.out.println("hello constructor");
	}
		
	
	
	public int add(int a,int b){
		System.out.println(greet);
		int result=a+b;
		return result;
		
	}

}
