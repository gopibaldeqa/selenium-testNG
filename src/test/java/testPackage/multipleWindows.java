package testPackage;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class multipleWindows {
	ChromeDriver driver = new ChromeDriver();
@Test
	public void multipleWindowsHandling() {
		driver.navigate().to("https://demoqa.com/browser-windows");
		driver.findElement(By.id("windowButton")).click();
		
		driver.manage().window().maximize();
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);
		
		for(String handle:windows) {
			System.out.println(handle);
			driver.switchTo().window(handle);
			String myText = driver.findElement(By.id("sampleHeading")).getText();
			System.out.println(myText);
		}
	
		
		driver.quit();
	}
}
