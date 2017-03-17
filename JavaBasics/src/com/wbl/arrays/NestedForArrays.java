package com.wbl.arrays;
public class NestedForArrays {

	public static void main(String[] args) {
		//Duplicates elements in a array
		
		int[] arr1 = {3,6,8,10,2,7};
		int[] arr2 = {4,5,6,10,7,3,12,1}; // 3,6,10,7
		
		System.out.println("Length of array1" +arr1.length);
		System.out.println("Length of array2" +arr2.length);

		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if (arr1[i] == arr2[j]) {
					
					System.out.println(arr1[i]);
				}
			}
		}

	}

}
