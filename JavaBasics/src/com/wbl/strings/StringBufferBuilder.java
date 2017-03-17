package com.wbl.strings;
public class StringBufferBuilder {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);
		
		String s = "Hello";
		s.concat("World");
		System.out.println(s);
		
		StringBuilder sb1 = new StringBuilder("Hello");
		sb1.append("World");
		System.out.println(sb1);

	}

}
