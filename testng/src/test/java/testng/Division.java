package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class Division extends BaseCalculator {
		
	@BeforeSuite
	public void createCalcObject(){
		calculator=new Calculator();
		System.out.println("Before Suite");
	}
	
	@BeforeMethod
	public void intializingVariables(){		
		System.out.println("Before Method");
	}
	
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
		long result = calculator.div(1, 0);		
	}	
	
}
