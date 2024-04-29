package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MavenTest1 {
	ChromeDriver driver = new ChromeDriver();    
	
	@BeforeSuite
	public void launchBrower() {

		driver.get("http://www.google.com");
		System.out.println("@@BeforeSuite");
	}
	
	@BeforeTest
	public void launchApplication() {
		System.out.println("@@BeforeTest");
	}
	
	@BeforeClass
	public void maxBrowser() {
		System.out.println("@@BeforeClass");
	}
	
	@BeforeMethod
	public void logInToApp() {
		System.out.println("@@BeforeMethod");
	}

	@Test
	public void test1() throws InterruptedException {      
		System.out.println("@@Test");
		driver.navigate().to("https://demo.nopcommerce.com/");
		
		driver.findElement(By.className("ico-login")).click();
		Thread.sleep(10000);
		driver.quit();
	}     

}
