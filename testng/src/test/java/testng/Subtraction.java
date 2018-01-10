package testng;

import static org.testng.Assert.assertTrue;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Subtraction extends BaseCalculator {

	@Test(dataProvider = "subtractingFunctionality")
	public void subtractionOfTwoNumbers(long firstNumber, long secondNumber, long expected) {
		long result = calculator.sub(firstNumber, secondNumber);
		Assert.assertEquals(result, expected);
	}

	@DataProvider(name = "subtractingFunctionality")
	public Object[][] dataprovider() {
		return new Object[][] { { 9, 3, 6 } };
	}
	
	
	@Test
	public void subTwoNumbers() {
		long result = calculator.sub(10, 5);
		Assert.assertEquals(result, 5);
	}
	
	@Test
	public void subTwoNegativeNumbers() {
		long result = calculator.sub(-10, -5);
		Assert.assertEquals(result, -5);
	}
	
	@Test
	public void subOneNegativeAndOnePositiveNumber() {
		long result = calculator.sub(-10, 5);
		Assert.assertEquals(result, -15);
	}
	
	@Test (dependsOnMethods="subTwoNumbers")
	public void subOnePositiveAndOneNegativeNumber() {
		long result = calculator.sub(10, -5);		
		Assert.assertEquals(result, 15);
	}
	
	@Test (dependsOnMethods="subDepentTest2")
	public void subDepentTest1() {	
		assertTrue(true);
	}
	
	@Test
	public void subDepentTest2() {
		assertTrue(true);
	}
}
