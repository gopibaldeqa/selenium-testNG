package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;

public class scrollIntoElement {
	
	static ChromeDriver driver = new ChromeDriver();
	public static void srollToElement() {
	driver.navigate().to("https://kitchen.applitools.com/ingredients/drag-and-drop");
	driver.manage().window().maximize();
	
	
}
}
