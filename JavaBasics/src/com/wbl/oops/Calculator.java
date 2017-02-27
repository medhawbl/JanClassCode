package com.wbl.oops;

public class Calculator {
	
	//method overloading
	public static double multiply(double a,double b){
		System.out.println("2  double parameters multiply method");
		double result = a*b;
		return result;
		
	}
	
	public Calculator(){
		
	}
	
	public Calculator(int a, int b){
		
	}
	/*
	public  double multiply(double a,double b){
		System.out.println("2  double parameters multiply method");
		double result = a*b;
		return result;
		
	}
	*/
	
	public int multiply(int a,int b){
		System.out.println("2 int parameters multiply method");
		int result = a*b;
		return result;
		
	}
	
	protected int multiply(int a,int b, int c){
		System.out.println("2 parameters multiply method");
		int result = a*b;
		return result;		
	}
	
	
	public double multiply(double a,double b,double c){
		System.out.println("3 parameters multiply method");
		double result = a*b*c;
		return result;
		
	}
	
	
	public static void main(String args[]){
		double a=5;
		double b=6;
		System.out.println("result is : "+Calculator.multiply(4d,5d));
		//System.out.println("result is : "+calc.multiply(4,5,6));
		
	}

}
