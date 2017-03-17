package com.wbl.exceptions;
//import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWrite {

	public static void main(String[] args) {
		
		try {
			
			PrintWriter pw = new PrintWriter("Test2.txt");
			//BufferedWriter bw = new BufferedWriter(pw);
			pw.write("Hi, How are you");
			pw.write("We are in fremont office");
			pw.flush();
			pw.close();
			
			
			//BufferedReader br = new BufferedReader(bw);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

}
