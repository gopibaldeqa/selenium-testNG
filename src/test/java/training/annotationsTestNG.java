package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotationsTestNG {
	
	@BeforeTest
	public static void beforeTest() {
		System.out.println("running before test");
	}
	
	@Test
	public static void dragAnItem() {
		System.out.println("running test 1");
	}
	
	@Test
	public static void drop() {
		System.out.println("running test 2");
	}
	@AfterTest
	public static void afterTest() {
		System.out.println("running after test");
	}

}
