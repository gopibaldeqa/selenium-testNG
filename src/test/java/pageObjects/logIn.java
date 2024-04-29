package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class logIn {
	
	static ChromeDriver driver= new ChromeDriver(); 
	
public static By btnLogIn = By.className("ico-login");

public static void logInTab() {
	driver.findElement(btnLogIn).click();
}
}
