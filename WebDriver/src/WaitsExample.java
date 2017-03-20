import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Ignore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class WaitsExample {

WebDriver driver;

	@BeforeClass
	public void beforeClass(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\WBL\\MedhaJanWorkspace\\WebDriver\\resources\\chromedriver.exe");
		//creating driver object
		driver = new ChromeDriver();
	}

	
	@Ignore
	public void implicitWaitExample() throws InterruptedException{
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
	}
	
	@Test
	public void explicitWaitExample(){
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();		
		
		//search field		
		driver.findElement(By.cssSelector("#global-search-input")).sendKeys("Laptops");
		
		WebDriverWait wait = new WebDriverWait(driver,20);
		String result = wait.until(function);
		System.out.println("From Function : " + result);
		
		/*wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".header-Typeahead-row")));
		
		List<WebElement> elements = driver.findElements(By.cssSelector(".header-Typeahead-row"));
		for(WebElement ele: elements)
		{
			if(ele.getText().equalsIgnoreCase("laptops on sale")){
				ele.click();
				break;
			}
		}
		System.out.println("Uri after selecting one item : " + driver.getCurrentUrl());*/
				
	}
	
	Function<WebDriver,String> function = new Function<WebDriver,String>(){

		@Override
		public String apply(WebDriver arg0) {
			WebDriverWait wait = new WebDriverWait(driver,20);
			List<WebElement> elements = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".header-Typeahead-row")));
			for(WebElement ele: elements)
			{
				if(ele.getText().equalsIgnoreCase("laptops on sale")){
					ele.click();
					break;
				}
			}
			return driver.getCurrentUrl();
		}
		
		
	};
	
}
