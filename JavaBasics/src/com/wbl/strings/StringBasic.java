package com.wbl.strings;
public class StringBasic {

	public static void main(String[] args) {

		String s = "Hello";
		s = s.concat("World");
		System.out.println(s);
		
		String str1 = "Hello";
		String str2 = "Hello";
		
		
		
		if(str1.equals(str2)){
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}
		
		String s1 = new String("Hello");
		String s2 = new String("Hello");
		
		if(s1.equals(s2)){
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}

	}

}
