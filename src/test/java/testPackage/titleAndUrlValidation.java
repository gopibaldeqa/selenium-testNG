package testPackage;

import static org.testng.Assert.assertEquals;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class titleAndUrlValidation {
	static ChromeDriver driver = new ChromeDriver();
	@Test
	public static void mousehover() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		String pageTitle = driver.getTitle();
		String pageUrl = driver.getCurrentUrl();
		
		//title validation
		System.out.println(pageTitle);
		assertEquals(pageTitle,"nopCommerce demo store");
		
		
		//url validation
		System.out.println(pageUrl);
		Assert.assertEquals("Title validation failed",pageUrl, "https://demo.nopcommerce.com/");
		
		driver.quit();
		
	}
}
