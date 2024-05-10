package testPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotations {

	@BeforeSuite
	public void beforeSuiteHandler() {
		System.out.println("beforeSuiteHandler");
	}
	@BeforeTest
	public void beforeTestHandler() {
		System.out.println("beforeTestHandler");
	}
	@BeforeClass
	public void beforeClassHandler() {
		System.out.println("beforeClassHandler");
	}
	@BeforeMethod
	public void beforeMethodHandler() {
		System.out.println("beforeMethodHandler");
	}

	@Test
	public void testHandler() {
		System.out.println("testHandler");
	}
	
	@AfterSuite
	public void afterSuiteHandler() {
		System.out.println("afterSuiteHandler");
	}
	@AfterTest
	public void afterTestHandler() {
		System.out.println("afterTestHandler");
	}
	@AfterClass
	public void afterClassHandler() {
		System.out.println("afterClassHandler");
	}
	@AfterMethod
	public void afterMethodHandler() {
		System.out.println("afterMethodHandler");
	}
}
