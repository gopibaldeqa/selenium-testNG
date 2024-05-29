package training;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class windowShifting {

	static ChromeDriver driver = new ChromeDriver();

	@Test
	public static void launchApplication1() throws InterruptedException {
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().window().maximize();

		driver.findElement(By.id("openwindow")).click();

		String pageTitle = driver.getTitle();

		System.out.println(pageTitle);

		String currentWindow = driver.getWindowHandle();

		Set<String> allWindowHandles = driver.getWindowHandles();

		System.out.println(currentWindow);
		System.out.println(allWindowHandles);

		Thread.sleep(2000);

		for (String handle : allWindowHandles) {

			if (!handle.equals(currentWindow)) {
				driver.switchTo().window(handle);
				
				String newPageTitle = driver.getTitle();

				System.out.println(newPageTitle);
			}



		}

		driver.quit();
//	driver.close();
	}

}
