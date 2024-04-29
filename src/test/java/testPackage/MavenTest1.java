package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTest1 {
         
	@Test
	public void test1() {      
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.navigate().to("http://www.amazon.com");
		driver.quit();
	}     

}
