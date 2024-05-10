package testPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

	
	
	@DataProvider(name="logInTestData")
	public Object[][] testData(){
	
		Object[][] data = {{"testmail01@gmail.com","12345"},{"testmail02@gmail.com","12345"},{"testmail03@gmail.com","12345"}};
		return data;
		
	}
	
	
	
	@Test(dataProvider="logInTestData")
	public void logInToApp(String mail,String pwd) {
		System.out.println(mail+pwd);
	}
}
