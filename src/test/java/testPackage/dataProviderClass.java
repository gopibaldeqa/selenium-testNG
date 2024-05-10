package testPackage;

import org.testng.annotations.Test;

public class dataProviderClass {

	@Test(dataProvider="logInTestData",dataProviderClass=dataProvider.class)
	public void logInToApp(String mail,String pwd) {
		System.out.println(mail+pwd);
	}
	
}
