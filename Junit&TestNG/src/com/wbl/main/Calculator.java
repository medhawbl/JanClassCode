package com.wbl.main;

public class Calculator {
	
	//+, -,*,%,/ // 2 input a, b
	public double doCalc(double a, double b, char op){
		System.out.println("From Calculator");
		double result= 0.0;
		
		switch(op){
		case '+' : result = a+b;
		break;
		case '-' : result = a-b;
		break;
		case '*' : result = a*b;
		break;
		case '/' : result = a/b;
		break;
		case '%' : result = a%b;
		break;
		
		}
		
		return result;
	}
	

}
