package training;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class launchApp {

	@Test
	public static void launchApplication() {

		ChromeDriver driver = new ChromeDriver();

		// for launching app
		driver.get("https://demo.nopcommerce.com/");

		// maximize chrome browser
		driver.manage().window().maximize();

		// get application title
		String appTitle = driver.getTitle();
		System.out.println(appTitle);

		// validating title
		Assert.assertEquals(appTitle, "nopCommerce demo store");

		// click on login tab
		driver.findElement(By.className("ico-login")).click();

		//enter username 
		driver.findElement(By.className("email")).sendKeys("abcd@gmail.com");
		
		//enter password
		driver.findElement(By.id("Password")).sendKeys("12345678");
		
		
		// close the current browser
   	  driver.quit();	

	}
}
