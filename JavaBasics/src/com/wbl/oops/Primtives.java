package com.wbl.oops;

public class Primtives {

	public static void main(String[] args) {
		byte b= 6;// -128 to 127
		
		byte b2= 0b00000110;
		System.out.println(b2);
		
		short s = 456;
		
		int i= 782789890;
		
		long l = 8897888;//l at the end
		
		float f = 67.89f;//f is used at the end
		
		double d= 276977.8789;
		
		char c = 'g';
		
		boolean bool= true;
		
		//assigning lower range variables to higher range variables
		//implicit casting or upcasting
	//	s=(short)b;
		i=s;
		//l=i;
		//d=f;
		System.out.println(i);

		//assigning higher range variables to lower range variables
		//explicit casting or downcasting
		//b=(byte)s;
		//s=(short)i;
		i=(int)l;
		System.out.println(i);
		

	}

}
