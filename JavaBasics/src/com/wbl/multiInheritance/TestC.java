package com.wbl.multiInheritance;

public class TestC {

	public static void main(String[] args) {
		B b = new C();
		b.test();
		
		C c = new C();
		c.test();
		
		A a = new C();
		a.test();
		

	}
	

}
