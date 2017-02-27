package com.wbl.oops;

public final class Count {
	
	public String greet;
	public  int id;
	public static int count;
	final int age=20;
	final float version = 1.2f;
	final double PI=3.14;
	
	static{
		System.out.println("THIS IS CALLED FIRST BEFORE EVEN CALLING CONSTRUCTOR");
	}
	
	public Count(){
		//age=30;
		System.out.println("constructor of count");
	}
	
	
	public Count(int a){
		//age=30;
		System.out.println("constructor of count");
	}
	public void test(){
		System.out.println("greet : "+ greet);
		System.out.println("id: "+id);
		System.out.println("count: "+count);
	
		//non static methods can access non static methods or variables
		staticTest();
	}

	
	public static void staticTest(){/*
		System.out.println("greet : "+ greet);
		System.out.println("id: "+id);*/
		System.out.println("count: "+count);
		//static methods cannot access non static methods or variables
		//test();
	}

}
