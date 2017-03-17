package com.wbl.arrays;
public class ArrayBasic {

	public static void main(String[] args) {
		
		int[] marks = {75, 85, 95, 65};
		String[] student = new String[4];
		student[0] = "Eng";
		student[1] = "math";
		student[2] = "science";
		student[3] = "social";
		
		for(int i =0; i<student.length;i++){
			
			System.out.println("Subject :" +student[i] + "   Marks :" +marks[i]);
		}
		
	}

}
