package com.wbl.exceptions;
import java.io.IOException;

public class TestMyException {

	public static void main(String[] args) {
		MyException me = new MyException();
	try{
		me.array();
	}catch(ArrayIndexOutOfBoundsException ae){
		System.out.println("Index given is out of range of an array");
	}catch (IOException e) {
		e.printStackTrace();
	}
	
	
	
	}
}
