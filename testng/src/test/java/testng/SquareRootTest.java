package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class SquareRootTest extends BaseCalculator{

	@BeforeSuite
	public void setUp(){
		calculator=new Calculator();		
	}
	
	@Test
	public void sqrtOfPositiveNumber() {
		double result = calculator.sqrt(4);
		Assert.assertEquals(result, 2.0);
	}	
	
	@Test
	public void sqrtOfNegativeNumber() {
		double result = calculator.sqrt(-9);
		Assert.assertEquals(result, 3.0);
	}	
	
	@Test
	public void sqrtOfFloatNumber() {
		double result = calculator.sqrt(4.5);
		Assert.assertEquals(result, 2.1213203435596424);
	}	
}
