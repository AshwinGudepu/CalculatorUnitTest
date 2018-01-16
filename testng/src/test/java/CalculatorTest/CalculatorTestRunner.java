package CalculatorTest;

import org.testng.annotations.DataProvider;
import testng.BaseCalculator;

public class CalculatorTestRunner extends BaseCalculator {
	
	@DataProvider(name = "numbersProvider")	
	public Object[][] dataprovider() {
		return new Object[][] { {0, 0.0}, {30, 0.5}, {45, 0.70710678118}, {60, 0.86602540378}, {90, 1.0} };
	}
}