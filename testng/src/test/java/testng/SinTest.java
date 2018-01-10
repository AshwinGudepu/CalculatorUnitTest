package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SinTest extends BaseCalculator {
	
	@Test(dataProvider = "numbersProvider")
	public void sinFunction(double degrees,double expected) {
		double result = calculator.sin(degrees);
		Assert.assertEquals(result, expected);
	}

	@DataProvider(name = "numbersProvider")	
	public Object[][] dataprovider() {
		return new Object[][] { {0, 0.0}, {30, 0.5}, {45, 0.70710678118}, {60, 0.86602540378}, {90, 1.0} };
	}	
	//Failing Tests: sin30,Sin45,sin60 and Sin 90	
}
