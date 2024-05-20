package testPackage;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class implicitAndExplicit {

	@Test
	public static void empAndExp() {
		ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");
	
String welcomeText =	driver.findElement(By.className("page-title")).getText();
System.out.println("nopcommerce welcome text : " +welcomeText);
Assert.assertEquals("Welcome, Please Sign In!", welcomeText);


// Initialize WebDriverWait with a timeout of 10 seconds
WebDriverWait wait = new WebDriverWait(driver, null);

// Wait until the element is visible and then get the element
WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("exampleElementId")));

// Perform actions on the element
element.click();
}

}
