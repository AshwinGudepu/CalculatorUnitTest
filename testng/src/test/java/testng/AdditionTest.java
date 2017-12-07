package testng;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class AdditionTest extends BaseCalculator {

	@BeforeSuite
	public void createCalcObject(){
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
	
	@AfterSuite
	public void tearDown(){
		calculator=null;
		System.out.println("After Suite");
	}
}
