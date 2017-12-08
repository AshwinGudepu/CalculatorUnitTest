package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class AdditionTest extends BaseCalculator {	
	
	@BeforeSuite
	public void setUp(){
		calculator=new Calculator();		
	}
		
	@Test
	@Parameters({ "firstNum", "secondNum", "expectedRes" })
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
	
	@Test
	public void sumOfTwoNegativeNumbers() {
		long result = calculator.sum(-5, -10);
		Assert.assertEquals(result, -15);
	}	
	
	@Test
	public void sumOfOnePostiveNumberAndNegativeNumbers() {
		long result = calculator.sum(5, -10);
		Assert.assertEquals(result, -5);
	}	
	
	@Test
	public void sumOfOnePostiveNumberAndZero() {
		long result = calculator.sum(5, 0);
		Assert.assertEquals(result, 5);
	}	
}
