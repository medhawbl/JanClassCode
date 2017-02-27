package com.wbl.oops;

public class Greet {
	
	//global scope
	public String greet="hello";
	
	
	public void greeting(String name){
		//String username="arthi";
		//here name and username are in local/method scope
		greet="hello today ";
		System.out.println(greet + " : "+name);
		
		int id=10;
		
		//block level scope
		for(int i=0;i<5;i++){
			id=20;
			System.out.println(id + i);	
		}
		
		System.out.println("id : "+id);
	}
	
	public void test(){
		System.out.println(greet);
	}
	
	public static void main(String args[]){
		Greet greet = new Greet();
		greet.greeting("Arti");
		greet.test();
	}

}
