package com.wbl.strings;
public class StringMethods {

	public static void main(String[] args) {
		
		String greet ="Hello World";
		
		char[] chars = greet.toCharArray();
		for(int i=0;i<greet.length();i++)
		{
			System.out.println(chars[i]);
		}
		
		/*for(char ch : chars)
		{
			System.out.println(ch);
		}*/
		
		System.out.println(greet.length());
		System.out.println(greet.substring(6));
		System.out.println(greet.trim());
		
		String s ="    hi    ";
		System.out.println(s.trim());
		System.out.println(s);
		System.out.println(greet.indexOf('l'));	
		System.out.println(greet.charAt(4));	
		
	}

}
