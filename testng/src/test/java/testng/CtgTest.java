package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgTest extends BaseCalculator {

	@Test
	public void ctgZero() {
		double result = calculator.ctg(0);
		Assert.assertEquals(result, 0.0);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctgThirty() {
		double result = calculator.ctg(30);
		Assert.assertEquals(result, 1.73205081);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctgFourtyFive() {
		double result = calculator.ctg(45);
		Assert.assertEquals(result, 1.0);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctgSixty() {
		double result = calculator.ctg(60);
		Assert.assertEquals(result, 0.57735027);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctgNinety() {
		double result = calculator.ctg(90);
		Assert.assertEquals(result, 0.0);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}
}