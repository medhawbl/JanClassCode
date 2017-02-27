package com.wbl.oops.inheritance;

public class TestAnimal {
	
	//super class refrence can hold child class objects
	public static void test(Animal a){
		
	}

	public static void main(String[] args) {
		
		
		/*Animal animal= new Animal();
		animal.makeNoise();*/
		
		Animal a = new Animal();
		
		Dog d= new Dog();
		
		Animal a1 = new Dog();
		
		//This gives an run time error- class cast exception
	    //d=(Dog)a;
		
		//implicit casting or upcasting - child ref to parent ref is done implicitly
		a=d;
		
		//explicit casting  or downcasting - parent ref to child ref should be done explicitly
		
		d=(Dog)a1;
		
		
		
		
		
		/*a.makeNoise();//animal class method
		d.makeNoise();//dog class method
		
		test(new Animal());
		
		*/
		
		//Dog d = new Dog();
		/*d.name="punto";
		d.test();*/
		/*System.out.println(d.name);
		d.eatFood();
		d.makeNoise();//dog class overridden method is called
		d.detectsThief();
		
		System.out.println("*************");
		
		Cat c= new Cat();
		c.name="princess";
		System.out.println(c.name);
		c.eatFood();
		c.makeNoise();//animal class method is called
		c.walksQuiet();*/
		

	}

}
