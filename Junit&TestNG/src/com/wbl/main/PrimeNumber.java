package com.wbl.main;

public class PrimeNumber {

	public boolean isPrime(int input){
		System.out.println("in prime method");
		for(int i=2; i<input/2 ; i++){
			if(input%i ==0){
				return false;
			}
		}
		return true;
	}
	
}
