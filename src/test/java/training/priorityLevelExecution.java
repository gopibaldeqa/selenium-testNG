package training;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priorityLevelExecution {
	static ChromeDriver driver = new ChromeDriver();

	
	@Test (priority=1)
	public static void betaTest() {

		System.out.println("betaTest");

	}
	
	
	@Test (priority=2)
	public static void applicationTest() {

		System.out.println("applicationTest");

	}
	

	
	@Test (priority=3)
	public static void thirdTest() {

		System.out.println("thirdTest");

	}
}
