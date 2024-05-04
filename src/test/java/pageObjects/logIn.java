package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.actions;

public class logIn extends actions{

	static ChromeDriver driver = new ChromeDriver();

	public static By btnLogIn = By.className("ico-login");
	public static By txtEmail = By.id("Email");

	
	public static void logInTab() {
		driver.findElement(btnLogIn).click();
	}
	public static void launchBrowser() {
		driver.navigate().to("https://demo.nopcommerce.com/");
	}
	
	public static void enterUserName() {
		driver.findElement(By.id("Email")).sendKeys("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAa");
	}
	public static void enterFromActionClass() {
		//typeElement(txtEmail);
	}
	
	 public static void findElement() {
		 WebElement element = driver.findElement(txtEmail);
	     typeElement(element);
	 }
}
