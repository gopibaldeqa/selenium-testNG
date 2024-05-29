package training;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invocationCount {
	static ChromeDriver driver = new ChromeDriver();

	
	@Test (invocationCount=1)
	public static void betaTest() {

		System.out.println("betaTest");
		
//		driver.quit();
		driver.close();

	}
	
	
	
}
