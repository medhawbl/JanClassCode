import static org.testng.Assert.*;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebDriverMethods {
	
	WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaJanWorkspace\\WebDriver\\resources\\chromedriver.exe");
		//creating driver object
		driver = new ChromeDriver();
	}

	
	@Test(enabled=true)
	public void testHomePageRegister(){
		
		//open browser with url
		driver.get("http://www.ebay.com/");
		
		System.out.println("Page Title::"+driver.getTitle());

		System.out.println("current url before:"+driver.getCurrentUrl());
		// get the element
		WebElement element = driver.findElement(By.linkText("register"));
		
		List<WebElement> mainlinksList = driver.findElements(By.className("gh-p"));
		System.out.println("size:"+mainlinksList.size());
		assertEquals(mainlinksList.size(), 4);
		
		String[] links = {"Daily Deals","Gift Cards","Help & Contact","Sell"};
		int i=0;
		for(WebElement elm:mainlinksList){
			//getAttribute in WebElement gives particular attribute value of a html element
			System.out.println("href::"+ elm.getAttribute("href"));
			assertNotNull(elm.getAttribute("href"));
			System.out.println(elm.getText());
			assertEquals(links[i], elm.getText().trim());
			i++;
		}
		//perform action - click
		element.click();
		
		//assert
		assertEquals(driver.getTitle(), "Sign in or Register | eBay");
		
		element=driver.findElement(By.id("email"));
		//we are enetering text in text box using sendkeys
		element.sendKeys("a@a.com");
		
		
		System.out.println("current url after:"+driver.getCurrentUrl());
		
		//closes the currently active browser window
		driver.close();
		
	}
	
	@Test(enabled=false)
	public void navigateExample() throws InterruptedException{
		
		driver.navigate().to("http://www.ebay.com/");
		
		assertEquals(driver.getCurrentUrl(),"http://www.ebay.com/");
		
		WebElement element = driver.findElement(By.linkText("register"));
		
		element.click();
		assertEquals(driver.getTitle(), "Sign in or Register | eBay");
		Thread.sleep(5000);
		
		driver.navigate().back();
		assertEquals(driver.getTitle(), "Electronics, Cars, Fashion, Collectibles, Coupons and More | eBay");
		Thread.sleep(5000);
		
		driver.navigate().forward();
		assertEquals(driver.getTitle(), "Sign in or Register | eBay");
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		Thread.sleep(5000);
		
		driver.close();
		
	}
	
	
	
	
	
	
	

}
