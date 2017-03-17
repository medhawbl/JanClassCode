package com.wbl.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	public String propertiesExample(String filename) throws FileNotFoundException,IOException{
		Properties prop = new Properties();
		
			FileInputStream inputStream = new FileInputStream("C:\\Users\\WBL\\Desktop\\dataprop.properties");
			prop.load(inputStream);				
			System.out.println("Zip : " + prop.getProperty("Zip"));		 
			
		return prop.getProperty("Zip");
		
	}

}
