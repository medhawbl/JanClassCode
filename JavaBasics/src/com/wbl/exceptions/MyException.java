package com.wbl.exceptions;
import java.io.File;
import java.io.IOException;

public class MyException {

	public void array() throws IOException, ArrayIndexOutOfBoundsException{
		int[] arr = {10,20,30};
		System.out.println(arr[3]);
		
		File f = new File("Tst.txt");
		f.createNewFile();
		
	}
	
}
