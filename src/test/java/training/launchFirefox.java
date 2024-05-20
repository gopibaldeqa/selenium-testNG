package training;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class launchFirefox {
	@Test
	public static void readText() {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
	String welcomeText =	driver.findElement(By.className("page-title")).getText();
	System.out.println("nopcommerce welcome text : " +welcomeText);
	Assert.assertEquals("Welcome, Please Sign In!", welcomeText);
	}
}
