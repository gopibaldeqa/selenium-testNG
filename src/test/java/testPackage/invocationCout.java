package testPackage;

import org.testng.annotations.Test;

public class invocationCout {

	@Test (invocationCount = 4)
	public static void invokeCount() {
		System.out.println("invocation Count print log");
	}
}
