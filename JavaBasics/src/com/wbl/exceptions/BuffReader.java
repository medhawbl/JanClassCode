package com.wbl.exceptions;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BuffReader {

	public static void main(String[] args) {
		String line = " ";
		int count =0;
	
		try {
			//FileInputStream in = new FileInputStream("Test.txt");
			File f = new File("Test.txt");
			f.createNewFile();		
			FileReader fr = new FileReader(f);
			
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("Hello World \n");
			bw.write("How are you today");
			bw.newLine();
			bw.write("Whats up");
			bw.flush();
			bw.close();
			
			BufferedReader br = new BufferedReader(fr);
			while((line = br.readLine())!=null){
				System.out.println(line);
				count++;
			}
			System.out.println("Total number of line in the file :: " + count);
			br.close();
			
						
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
