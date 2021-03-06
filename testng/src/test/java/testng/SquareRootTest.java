package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareRootTest extends BaseCalculator{
	
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
