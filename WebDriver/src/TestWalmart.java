import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestWalmart {

WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaJanWorkspace\\WebDriver\\resources\\chromedriver.exe");
		//creating driver object
		driver = new ChromeDriver();
	}

	
	@Test
	public void testWalmart(){
		driver.get("https://www.walmart.com/");
		//finding the search element
		List<WebElement> ele = driver.findElements(By.id("global-search-input"));
		System.out.println("Size of search : " + ele.size());
	}
	
	@Test
	public void getLocationTwitter(){
		driver.get("http://www.whiteboxqa.com/");
		List<WebElement> element = driver.findElements(By.cssSelector(".fa.fa-twitter"));
		for(WebElement ele : element){
			Point point = ele.getLocation();
			System.out.println("X point : " + point.x);
			System.out.println("Y point : " + point.y);
			
			Dimension dim = ele.getSize();
			System.out.println("Height : " + dim.height);
			System.out.println("Width : " + dim.width);
		}
	
	}

}
