package testng;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class Multiplication extends BaseCalculator {
	
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

}
