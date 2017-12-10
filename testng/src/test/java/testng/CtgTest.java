package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.epam.tat.module4.Calculator;

public class CtgTest extends BaseCalculator {

	@BeforeSuite
	public void setUp(){
		calculator=new Calculator();		
	}
	
	@Test
	public void ctg0() {
		double result = calculator.ctg(0);
		Assert.assertEquals(result, 0.0);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctg30() {
		double result = calculator.ctg(30);
		Assert.assertEquals(result, 1.73205081);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctg45() {
		double result = calculator.ctg(45);
		Assert.assertEquals(result, 1.0);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctg60() {
		double result = calculator.ctg(60);
		Assert.assertEquals(result, 0.57735027);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}

	@Test
	public void ctg90() {
		double result = calculator.ctg(90);
		Assert.assertEquals(result, 0.0);
		//This test is failed. Ideally value is not defined. As part of assignment I am writing these comments
	}
}