package com.wbl.test;

import static org.junit.Assert.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;
import com.wbl.main.ReadProperties;

public class TestReadProperties{
	
	@Test//(expected = FileNotFoundException.class)
	public void getCityTest()  throws FileNotFoundException, IOException {
		ReadProperties rp = new ReadProperties();		
		assertEquals("12345",rp.propertiesExample("Zip"));
	}
}
