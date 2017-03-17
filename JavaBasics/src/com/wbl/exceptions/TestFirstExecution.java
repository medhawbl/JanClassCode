package com.wbl.exceptions;
import java.io.File;
import java.io.IOException;

public class TestFirstExecution {

	public static void main(String[] args) {
	
		//FirstException fe = new FirstException();
		//fe.testError("123");
		File f = new File("Tst.txt");
		
		
		try{
			f.createNewFile();
			int[] arr ={10,20,30};
			System.out.println(arr[3]);				
		}	
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Index given is out of range of an array");
		}catch (IOException e) {
			e.printStackTrace();
		}		
		finally{
			System.out.println("File Closing");
		}
		System.out.println("Hello World");
		System.out.println("Hello World, how are you");
	}

}
