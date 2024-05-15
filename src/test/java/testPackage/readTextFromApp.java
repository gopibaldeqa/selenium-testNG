package testPackage;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class readTextFromApp {

	static ChromeDriver driver = new ChromeDriver();
	@Test
	public static void mousehover() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		
		String welcomeText = driver.findElement(By.className("topic-block-title")).getText();
		
		//validation
		System.out.println(welcomeText);
		Assert.assertEquals("Title validation failed",welcomeText, "Welcome to our store");
		
		driver.quit();
	}
}
