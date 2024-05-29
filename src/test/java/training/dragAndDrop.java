package training;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDrop {

	
	@Test
	public static void dragAnItem() {
		ChromeDriver driver = new ChromeDriver();
		
		
		driver.get("https://kitchen.applitools.com/ingredients/drag-and-drop");
		
		driver.manage().window().maximize();
		
		
		Actions builder = new Actions(driver);
		
		WebElement from = driver.findElement(By.id("menu-fried-chicken"));
		WebElement to = driver.findElement(By.id("plate-items"));
		
		builder.dragAndDrop(from, to).perform();
	}
}
