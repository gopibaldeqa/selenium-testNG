package testPackage;

import java.util.List;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class findAllLinks {
	static ChromeDriver driver = new ChromeDriver();
	@Test
	public static void mousehover() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//List<WebElement> allLinks= driver.findElementsByTagname("a");
		List<WebElement> allTags= driver.findElements(By.tagName("a"));
		System.out.println(allTags.size());
		
		for(int i=0;i<=allTags.size();i++) {
			System.out.println(allTags.get(i).getAttribute("href"));

			System.out.println(allTags.get(i).getText());
		
		}
			driver.quit();
	}
}
