package com.wbl.oops;


public class StudentTest {

	public static void main(String[] args) {

		//initialsing data thru parameterised constructor
		Student s1 = new Student();
		s1.id=1;
		s1.name="remya";
		s1.displayDetails();
		
		Student s2= new Student(2,"rechja");		
		/*s2.id=2;
		s2.name="rechja";
		
		s2.id=3*/;
		s2.displayDetails();

	}

}
