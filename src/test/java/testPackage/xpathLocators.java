package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.gherkin.model.Then;

public class xpathLocators {
	static ChromeDriver driver = new ChromeDriver();
	
	
	@Test
		public static void xpathElements() throws InterruptedException {
			driver.navigate().to("https://demo.nopcommerce.com/");
			driver.manage().window().maximize();
			
			 String myInput = "iphone 14 8 GB ram";
			 
			 Thread.sleep(10000);
			 driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input']")).sendKeys(myInput);
			 
			 
			 //contains
			 driver.findElement(By.xpath("//input[contains(@class,'search-box-text ui-autocomplete')]")).clear();
			 
			 
			driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input'][@id='small-searchterms']")).sendKeys(myInput);
		
			
			driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input' and @id='small-searchterms']")).sendKeys(myInput);
			
			
			driver.findElement(By.xpath("//input[@class='search-box-text ui-autocomplete-input' or @id='small-d']")).sendKeys(myInput);
			
			//normalize space 
			driver.findElement(By.xpath("//a[normalize-space()='Computers']")).sendKeys(myInput);
			
			
			driver.quit();
		}
}
