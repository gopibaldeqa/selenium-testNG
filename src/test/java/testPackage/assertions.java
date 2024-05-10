package testPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class assertions {
	static ChromeDriver driver = new ChromeDriver();
	
	@Test
	public void test1() throws InterruptedException {  
		driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		
		//visible 
		driver.findElement(By.className("page-title")).isDisplayed();
		String  myUrl = driver.getCurrentUrl();
		System.out.println(myUrl);
		
		//assert equals
		
		Assert.assertEquals("Title validation failed",myUrl, "https://demo.nopcommerce.com/login?returnUrl=%2F");
		
		//contains
		
		Assert.assertTrue("Title validation failed",myUrl.contains("login"));
		
		
		driver.quit();
	}
}
