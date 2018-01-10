package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CosTest extends BaseCalculator {
	
	@Test
	public void cos0() {
		double result = calculator.cos(0);
		Assert.assertEquals(result, 1);
	}

	@Test
	public void cos30() {
		double result = calculator.cos(30);
		Assert.assertEquals(result, 0.86602540378);
	}
	
	@Test
	public void cos45() {
		double result = calculator.cos(45);
		Assert.assertEquals(result, 0.70710678118);
	}
	
	@Test
	public void cos60() {
		double result = calculator.cos(60);
		Assert.assertEquals(result, 0.5);
	}
	
	@Test
	public void cos90() {
		double result = calculator.cos(90);
		Assert.assertEquals(result, 0);
	}
}
