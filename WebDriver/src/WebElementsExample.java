import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class WebElementsExample {
WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaJanWorkspace\\WebDriver\\resources\\chromedriver.exe");
		//creating driver object
		driver = new ChromeDriver();
	}

	
	@Test
	public void walmartSignUp(){
	
		driver.get("https://www.walmart.com/");
		System.out.println("Checking for the Url of the page : " + driver.getCurrentUrl());
		System.out.println("Checking for the title of the page : " + driver.getTitle());
		driver.navigate().to("https://www.walmart.com/account/signup?tid=0&returnUrl=%2F");
		
		List<WebElement> element = driver.findElements(By.cssSelector(".form-control"));
		System.out.println("To know the size of the Form : " + element.size());//5
		
		for(WebElement element2: element){
			System.out.println(element2.getText());
		}
		
		WebElement element1 = driver.findElement(By.name("firstName"));
		element1.sendKeys("John");
		element1.clear();
		System.out.println("Prints the attribute : " + element1.getAttribute("type"));
		System.out.println("Prints the Tag Name : " + element1.getTagName());//input
		System.out.println("Prints the Css Value : " + element1.getCssValue("font-weight"));
		System.out.println("Prints the location : " + element1.getLocation());
		System.out.println("Prints the attribute : " + element1.getText());
	}
	
	@AfterClass
	public void afterClass(){
		
		driver.close();
	}
	
}
