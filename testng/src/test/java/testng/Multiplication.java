package testng;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class Multiplication extends BaseCalculator {
	
	@BeforeMethod
	public void multiplication(){
		calculator=null;
		calculator=new Calculator();		
	}
	
	@Test
	public void multipicationOfTwoNumbers(){
		long result=calculator.mult(10, 10);
		assertEquals(result, 100);		
	}
	
	@Test
	public void multipicationOfTwoNegativeNumbers(){
		long result=calculator.mult(-10, -10);
		assertEquals(result, 100);		
	}
	
	@Test
	public void multOnePostiveAndOneNegNum(){
		long result=calculator.mult(10, -10);
		assertEquals(result, -100);		
	}
	
	@Test
	public void multOneNegAndOnePosyNum(){
		long result=calculator.mult(-10, 10);
		assertEquals(result, -100);		
	}
	
	@Test
	public void multiplicationByZero(){
		long result=calculator.mult(10, 0);		
		assertEquals(result, 0);		
	}

	@AfterMethod
	public void afterMultiplication(){
		calculator=null;		
	}
	
}
