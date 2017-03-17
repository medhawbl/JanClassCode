//import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FacebookDropnRadio {

WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaJanWorkspace\\WebDriver\\resources\\chromedriver.exe");
		//creating driver object
		driver = new ChromeDriver();
	}

	
	@Test
	public void facebookLogin() throws InterruptedException{
		driver.get("https://www.facebook.com/");
		//entering firstname value
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("u_0_1")).sendKeys("Innovapath");
		
		//selecting from the dropdown
		WebElement element = driver.findElement(By.id("month"));
		Select select = new Select(element);
		select.selectByIndex(1);
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByValue("9");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("2000");
		
		
		//for selecting radio button female
		WebElement ele = driver.findElement(By.id("u_0_k"));
		//ele.click();
		System.out.println("Is Selected : " +ele.isSelected()); //true
		System.out.println("Is Displayed : " +ele.isDisplayed());//
		System.out.println("Is Enabled : " +ele.isEnabled());//
		Thread.sleep(500);
		
		
		
		
		driver.navigate().to("http://wenzhixin.net.cn/p/multiple-select/docs/");
		
		//Select select;
		
		select = new Select(driver.findElement(By.xpath("//*[@id='e1_f']/select")));
		Thread.sleep(1000);
		select.selectByVisibleText("January");
		select.selectByVisibleText("February");
		select.selectByVisibleText("March");
		//select.
		select.selectByValue("9");
		select.selectByIndex(4);
		select.deselectByIndex(4);
		select.deselectByVisibleText("January");
		System.out.println("check for multiple select : " + select.isMultiple());
		
		
		Thread.sleep(1000);
		
		
		driver.close();
		
		
	}
	
	/*@AfterClass
	public void afterClass(){		
		driver.close();
	}*/
	
}
