package com.wbl.oops;

public class PassByValue {
	
	public void increment(int a){
		a=a+1;
	}
	
	public void student(Student s){
		s.id=2;
		s.name="Alan";
	}

	public static void main(String[] args) {
		PassByValue pb = new PassByValue();
		//For primitives
		int i=10;
		System.out.println("Before method call:"+i);
		pb.increment(i);
		System.out.println("After method call:"+i);
		
		//For objects
		Student s = new Student();
		s.id=10;
		s.name="Aktar";
		
		System.out.println("Before method call : "+s.id+" : "+s.name);
		pb.student(s);
		System.out.println("After method call : "+s.id+" : "+s.name);

	}

}
