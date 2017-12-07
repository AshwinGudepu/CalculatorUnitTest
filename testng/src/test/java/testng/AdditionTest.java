package testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AdditionTest extends BaseCalculator {

	@Test
	@Parameters({ "firstNumber", "secondNumber", "expected" })
	public void sumOfTwoNumbers(long firstNumber, long secondNumber, long expected) {
		long result = calculator.sum(firstNumber, secondNumber);
		Assert.assertEquals(result, expected);
	}

	@Test(dataProvider = "numbersProvider")
	public void sumOfTwoNumbersWithMultipleTestData(long firstNumber, long secondNumber,long expected) {
		long result = calculator.sum(firstNumber, secondNumber);
		Assert.assertEquals(result, expected);
	}

	@DataProvider(name = "numbersProvider")
	public Object[][] dataprovider() {
		return new Object[][] { {3, 5, 8}, {-1, 8, 7} };
	}
}
