package com.wbl;

public class WrapperClass {
	
	
	public static void main(String[] args){
		int i=10;
		float f=45.6f;
		
		
	

		Integer i2 = 20;
		
		boolean b= true;
		Boolean b1= true;
		
		
		String s1="650";
		//converts string to integer
		int i3=Integer.parseInt(s1);
		System.out.println(i3);
		
		////converts string to float
		float f2=Float.parseFloat("65.56");
		
		////converts integer to string
		Integer i1 = new Integer(20);
		String s2=i1.toString();
		String s3=Integer.toString(54);
		
		System.out.println(s2);
		
		//primitive to integer object
		Integer i4=Integer.valueOf(5);
		
		
		//AutoBoxing and Unboxing
		Integer i5= new Integer(20);
		Integer i6= boxUnbox(i5);
		System.out.println("box and unbox :"+i6);
		
	}
	
	public static Integer boxUnbox(int i){
		i++;
		return i;
		
	}

}
