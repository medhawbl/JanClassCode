package com.wbl.operatorsAndLoops;

import com.wbl.oops.Employee;

public class Operators {
	
	public static void greatest(int a, int b){
		if(a>b){
			System.out.println("a is greater");
		}else if(a<b){
			System.out.println("b is greater");
		}else if(a==b){
			System.out.println("Both are equal");
		}else{
			
		}
	}
	
	//mulitples of 3 and 5
	public static void multiplesOf3And5(int input){
		if((input%3)==0 && (input%5)==0){
			System.out.println("div by 3 and 5");
		}else if(input%5==0){
			System.out.println("div by 5");
		}else if(input%3==0){
			System.out.println("div by 3");
		}
	}

	public static void main(String[] args) {
		//arithmetic 
		int a=14;
		int b=5;
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);

		System.out.println("b divides a and return quotient : "+(a/b));

		System.out.println("b divides a and return remainder : "+(a%b));
		
		//unary operators
		int c=5;
		System.out.println(c++);// after execution- expression is evaluated
		System.out.println(c);
		System.out.println(++c);//before execution- expression is evaluated
		
		int d=+10;//positive num
		int e=-10;//negative num
		
		
		boolean bool= false;
		if(!bool){
			System.out.println("hello");
		}else{
			System.out.println("hi");
		}
		
		
		//relational
		greatest(40,40);
		
		//conditional
		multiplesOf3And5(20);
		
		//ternary - acts as short cut for simple if else
		int result = a<b ? a : b;
		System.out.println(result);
		
		//instanceof
		Employee emp = new Employee(4,"sita");
		emp.displayDetailsOfemp();
		//Object is super class for all classes- abd below are some object class methods
		System.out.println(emp.toString());
		System.out.println(emp.hashCode());
		
		if(emp instanceof Object){
			System.out.println("Yes it is instance of Object");
		}
		
		//bitwise
		byte b1= 4;
		byte b2= 6;
		int b3= b1 & b2;
		b3=~b1;
		System.out.println(b3);
		

	}

}
