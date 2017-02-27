package com.wbl.oops;

public class Student {
	
	protected int id;
	public String name;
	
	//this a default constructor- added by jvm if we do not add one
	public Student(){
		System.out.println("Hello to default constructor");
	}
	
	//this is parameterised constructor
	public Student(int id1, String name1){
		System.out.println("Hello to  parameterised constructor");
		id=id1;
		name=name1;
	}

	 public void displayDetails(){
		System.out.println("id : "+id);
		System.out.println("name : "+name);
	}

}
