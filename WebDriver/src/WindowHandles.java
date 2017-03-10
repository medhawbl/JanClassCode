import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WindowHandles {
	
WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaJanWorkspace\\WebDriver\\resources\\chromedriver.exe");
		//creating driver object
		driver = new ChromeDriver();
	}

	@Test
	public void windowHandles(){
		driver.get("http://whiteboxqa.com/");
		System.out.println("url before"+driver.getCurrentUrl());
		driver.findElement(By.id("headerfblogin")).click();
		
		String currentWindowName = driver.getWindowHandle();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String childwindow: allWindows){
			if(!childwindow.equals(currentWindowName)){
			driver.switchTo().window(childwindow);
			break;
			}
		}
		
		
		driver.findElement(By.name("email")).sendKeys("a@s.com");
		driver.findElement(By.name("pass")).sendKeys("test123");

		System.out.println("url after"+driver.getCurrentUrl());
		
		//closes all the open windows for current driver instance
		driver.quit();
		
		
	}

}
