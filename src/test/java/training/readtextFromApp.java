package training;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readtextFromApp {

	@Test
	public static void readText() {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
		
	String welcomeText =	driver.findElement(By.className("page-title")).getText();
	System.out.println("nopcommerce welcome text : " +welcomeText);
	Assert.assertEquals("Welcome, Please Sign In!", welcomeText);
	}
}
