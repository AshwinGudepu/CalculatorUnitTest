package testng;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Division extends BaseCalculator {
		
	@Test
	@Parameters({ "firstNumber", "secondNumber", "expected" })
	public void divisionOfTwoNumbers(long firstNumber, long secondNumber, long expected) {
		long result = calculator.div(firstNumber, secondNumber);
		Assert.assertEquals(result, expected);
	}
	
	@Test(dataProvider = "numbersProvider")	
	public void divOfTwoNumbers(long firstNumber, long secondNumber,long expected) {
		long result = calculator.div(firstNumber, secondNumber);
		Assert.assertEquals(result, expected);
	}

	@DataProvider(name = "numbersProvider")	
	public Object[][] dataprovider() {
		return new Object[][] { {3, 3, 1}, {16, 8, 2}, {-9,9,-1} };
	}

	@Test(expectedExceptions=NumberFormatException.class,expectedExceptionsMessageRegExp ="Attempt to divide by zero")	
	public void divideByZero() {
		calculator.div(1, 0);				
	}	
	
}
