package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionsClass {
static ChromeDriver driver = new ChromeDriver();
	@Test
	public static void mousehover() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		Actions builder = new Actions(driver);
		WebElement mouseElm = driver.findElement(By.xpath("//a[text()='Electronics ']"));
		builder.moveToElement(mouseElm).build().perform();
		driver.quit();
	}
}
