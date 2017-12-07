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
		System.out.println("Before Suite");
	}
	
	@BeforeMethod
	public void intializingVariables(){
		long firstNumber=0;
		long secondNumber=0;
		long expected=0;
		System.out.println("Before Method");
	}
	
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
	
	@AfterSuite
	public void tearDown(){
		calculator=null;
		System.out.println("After Suite");
	}
}
