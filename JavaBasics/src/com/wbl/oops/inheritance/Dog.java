package com.wbl.oops.inheritance;

//import com.wbl.oops.Greet;
import com.wbl.oops.StudentGreet;

public class Dog extends Animal{
	
	public String name="DOG";
	
	public Dog(){
		super();
		System.out.println("Dog constructor!!!!");
	}
	

	public void detectsThief(){
		System.out.println("Thief found!!!!!!!");
	}
	
	@Override
	public void makeNoise(){
		System.out.println("Dog says bow bow");
	}
	
	@Override
	public StudentGreet hello(){
		StudentGreet g = new StudentGreet();
		return g;
		//return new Greet();
	}
	
	
	public void test(){
		//using super we cann access parent class methods
		//when you have same method in child and parent
		super.makeNoise();

		//using super we cann access parent class variables
		//when you have same variable in child and parent
		String petname= super.name;
		System.out.println(petname);
	}
	
}
