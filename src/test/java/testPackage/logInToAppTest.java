package testPackage;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pageObjects.logIn;
public class logInToAppTest extends logIn{
	
	static ChromeDriver driver = new ChromeDriver();
	@Test
	public void test1() {      
		System.out.println("@@Test");
		driver.navigate().to("https://demo.nopcommerce.com/");
//		this.btnLogIn();

	}

}
