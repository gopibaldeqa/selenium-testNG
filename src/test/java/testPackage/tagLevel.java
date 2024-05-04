package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class tagLevel {

	static ChromeDriver driver = new ChromeDriver();
	@Test 
	public static void z_firstTest() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("1111111111111111111111111111111111");
		//driver.quit();
	}
	@Test 
	public static void m_secondTest() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("2222222222222222222222222222");
		//driver.quit();
	}
	@Test 
	public static void a_thirdTest() {
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		System.out.println("333333333333333333333333333333333");
//		driver.quit();
	}
}
