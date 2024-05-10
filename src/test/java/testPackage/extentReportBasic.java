package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class extentReportBasic {
	
	static ChromeDriver driver = new ChromeDriver();
	@Test
	public static void mousehover() {
		
//		// start reporters
//	    ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html");
//
//	    // create ExtentReports and attach reporter(s)
//	    ExtentReports extent = new ExtentReports();
//	    extent.attachReporter(htmlReporter);
//
//	    // creates a toggle for the given test, adds all log events under it    
//	    ExtentTest test = extent.createTest("MyFirstTest", "Sample description");

		
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();

	}
}
