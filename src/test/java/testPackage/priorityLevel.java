package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priorityLevel {
	static ChromeDriver driver = new ChromeDriver();
	@Test (priority= 3)
	public static void firstTest() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("1111111111111111111111111111111111");
		driver.quit();
	}
	@Test (priority=2)
	public static void secondTest() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("2222222222222222222222222222");
		//driver.quit();
	}
	@Test (priority=1)
	public static void thirdTest() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("333333333333333333333333333333333");
//		driver.quit();
	}
}
