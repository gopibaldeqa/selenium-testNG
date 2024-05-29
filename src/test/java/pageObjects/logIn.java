package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import util.actions;

public class logIn extends actions {

	static ChromeDriver driver = new ChromeDriver();

	public static By btnLogIn = By.className("ico-login");
	public static By txtEmail = By.id("Email");

	public static void launchBrowser(String url) {
		driver.navigate().to(url);
	}

	public static void enterUserName(String userMail) {
		driver.findElement(By.id("Email")).sendKeys(userMail);
	}

	public static void enterPassword(String password) {
		driver.findElement(By.cssSelector("#Password")).sendKeys(password);
	}

	public static void logInTab() {
		driver.findElement(btnLogIn).click();
	}
}
