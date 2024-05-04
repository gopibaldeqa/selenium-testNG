package testPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragAndDrop {
static ChromeDriver driver = new ChromeDriver();
	@Test
	public static void dragAndDropElement() {
		driver.navigate().to("https://kitchen.applitools.com/ingredients/drag-and-drop");
		driver.manage().window().maximize();
//		driver.findElement(By.className("")).dragAndDrop();
		
		Actions builder = new Actions(driver);
		WebElement from = driver.findElement(By.id("menu-fried-chicken"));
		WebElement to = driver.findElement(By.id("plate-items")); 
		//Perform drag and drop
		builder.dragAndDrop(from, to).perform();
		
	}		
}
