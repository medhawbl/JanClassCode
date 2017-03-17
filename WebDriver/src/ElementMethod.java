import java.util.List;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ElementMethod {
	WebDriver driver;
	
		@BeforeClass
		public void beforeClass(){
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaJanWorkspace\\WebDriver\\resources\\chromedriver.exe");
			//creating driver object
			driver = new ChromeDriver();
		}
		@Ignore
		public void walmartSignUp() throws InterruptedException{
			driver.get("https://www.walmart.com/");
			System.out.println("Printing current URL : " + driver.getCurrentUrl());
			System.out.println("Printing Title : " + driver.getTitle());
			driver.navigate().to("https://www.walmart.com/account/signup?returnUrl=%2Faccount");
			Thread.sleep(500);
			//driver.findElement(By.xpath("//*[@class ='form-control']")).click();
			//System.out.println("Printing current URL : " + driver.getCurrentUrl());
			Thread.sleep(500);
			//List<WebElement> element = driver.findElements(By.xpath("//*[@class ='form-control']"));
			List<WebElement> element = driver.findElements(By.cssSelector(".form-control"));
			System.out.println("Size of Elements : " + element.size());
			//System.out.println("Size of Elements : " + element.);
			WebElement element1 = driver.findElement(By.name("firstName"));
			element1.sendKeys("john");
			System.out.println("Printing the attribute : " + element1.getAttribute("name"));
			System.out.println("Printing the tagname : " + element1.getTagName());
			System.out.println("Printing the Line height : " + element1.getCssValue("line-height"));
			System.out.println("Printing the Location : " + element1.getLocation());
			
			//element1.getLocation()
			element1.clear();
			
			
		
		}
		
		@Test
		public void facebookHome() throws InterruptedException{
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("u_0_1")).sendKeys("Innovapath");
			System.out.println(driver.findElement(By.id("month")).getText());
			WebElement element = driver.findElement(By.id("month"));
			Select select = new Select(element);
			select.selectByIndex(1);
			
			select = new Select(driver.findElement(By.id("day")));
			select.selectByVisibleText("23");
			
			select = new Select(driver.findElement(By.id("year")));
			select.selectByValue("2000");
			
			List<WebElement> options = select.getOptions();
			for(WebElement element1: options)
				System.out.println(element1.getText());
			
			driver.findElement(By.id("u_0_h")).click();
			Thread.sleep(500);
			
		}

}
