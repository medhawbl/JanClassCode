package com.wbl.oops.inheritance;

import com.wbl.oops.Greet;

public class Animal {
	
	public Animal(){
		System.out.println("Default constructor!!!!"+ name);
	}
	
	public Animal(String name){
		System.out.println("Animal constructor!!!!"+ name);
	}
	
	protected String name="ANIMAL";
	public String breed;
	
	public void eatFood(){
		System.out.println("Has food...");
	}
	
	protected void makeNoise(){
		System.out.println("Makes Noise.....");
	}
	
	
	public Greet hello(){
		Greet g = new Greet();
		return g;
		//return new Greet();
	}
	
	public int getId(){
		int i=10;
		return i;
	}
	

}
