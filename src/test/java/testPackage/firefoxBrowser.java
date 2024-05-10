package testPackage;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefoxBrowser {

	FirefoxDriver driver = new FirefoxDriver();
	@Test
	public void launchFirefox() {
		driver.get("http://www.google.com");
	}
}
