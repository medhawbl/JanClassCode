package com.wbl.arrays;
public class SmallestValueArray {

	public static void main(String[] args) {
		//smallest value from array
		int[] numbers = new int[]{30,40,2,90,60};
		int small = numbers[0];
		
		for(int i = 1;i<numbers.length; i++){
			if(numbers[i]<small)
				small = numbers[i];
		}
		System.out.println("Smallest value in the array is : " + small);
		
	}

}
