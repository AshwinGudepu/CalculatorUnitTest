package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import CalculatorTest.CalculatorTestRunner;

public class SinTest extends BaseCalculator {
	
	@Test(dataProvider = "numbersProvider",dataProviderClass=CalculatorTestRunner.class)
	public void sinFunction(double degrees,double expected) {
		double result = calculator.sin(degrees);		
		Assert.assertEquals(result, expected);
	}
	//Failing Tests: sin30,Sin45,sin60 and Sin 90	
}
