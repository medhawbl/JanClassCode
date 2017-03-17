package com.wbl.exceptions;
import java.io.File;
import java.io.IOException;

public class CreateDir {

	public static void main(String[] args) {
		
		File dir = new File("MyDirectory");
		dir.mkdir();
		File file = new File("MyDirectory","Test3.txt");
		try {
			System.out.println("Before File Creation :: " +file.exists());
			file.createNewFile();
			System.out.println("After File Creation :: " + file.exists());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
	}

}
