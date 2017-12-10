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

	@Test(dependsOnGroups = { "database" })
	public void runFinal() {
		System.out.println("Run");
	}
}
