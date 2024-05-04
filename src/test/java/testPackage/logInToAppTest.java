package testPackage;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.logIn;
public class logInToAppTest extends logIn{
	
	static ChromeDriver driver = new ChromeDriver();
	
	@Test
	public void test1() throws InterruptedException {      
		System.out.println("@@Test@@");
		launchBrowser();

		logInTab();
		Thread.sleep(5000);
		//enterUserName();
		findElement();
//		Thread.sleep(5000);
		driver.quit();
	}

}
