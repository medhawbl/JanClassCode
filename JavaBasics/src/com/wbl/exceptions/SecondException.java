package com.wbl.exceptions;
public class SecondException {

	public static void main(String[] args) {
		
		//Test t = new Test();
		//t.Test1();
//		
//		int i = 10;
//		
//		if(i<0){
//			throw new CustomMessage("I cannot be -ve");
//		}
//		
		
		int[][] array = {{00,01,02,03,04},{10,11,12,13,56},{110,11,12,13,67},{20,21,22,23,56}};
		  int rows= array.length;
		  int cols= array[0].length;
		  for(int i=0;i<array.length;i++){
		   for(int j=0;j<array[i].length;j++){
		    System.out.print(array[i][j]+" ");
		   }
		   System.out.println();
		  }
		  System.out.println("******************");
		  int[][] array2 = new int[cols][rows];
		  int k=0;
		  for(int i=array.length-1;i>=0;i--){
		   for(int j=0;j<array[i].length;j++){
		    array2[j][k]=array[i][j];
		   }
		   k++;
		  }
		  for(int i=0;i<array2.length;i++){
		   for(int j=0;j<array2[i].length;j++){
		    System.out.print(array2[i][j]+" ");
		   }
		   System.out.println();
		  }
		
	}

}
