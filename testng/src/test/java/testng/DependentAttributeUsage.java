package testng;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class DependentAttributeUsage {

	@BeforeGroups("database")
	public void setupDB() {
		System.out.println("DB set up");
	}

	@AfterGroups("database")
	public void cleanDB() {
		System.out.println("close DB");
	}

	@Test(groups = "database")
	public void testConnectOracle() {
		System.out.println("Connection Successfull");
	}	

	@Test(groups = "login")
	public void appLogin() {
		System.out.println("Application Login");
	}
	
	@Test(groups = "loginFailure")
	public void appLoginFail() {
		System.out.println("Application Failed Login");
	}
	
	@Test(dependsOnGroups = { "database" })
	public void runDb() {
		System.out.println("runDb");
	}
}
