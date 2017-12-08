package testng;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class PowerTest extends BaseCalculator {
	
	@BeforeSuite
	public void setUp(){
		calculator=new Calculator();		
	}
	
	@Test
	public void powerOfPositiveNumber() {
		double result = calculator.pow(2,2);
		Assert.assertEquals(result, 4.0);
	}	
	
	@Test
	public void tenTothePowerTen() {
		double result = calculator.pow(10,3);
		Assert.assertEquals(result, 1000.0);
	}	
	
	//This test is failing
	@Test
	public void powerOfNegativeAndPositiveNumber() {
		double result = calculator.pow(3,-3);		
		Assert.assertEquals(result, 27.0);
	}	
	
	@Test
	public void powerOfPositiveAndNegativeNumber() {
		double result = calculator.pow(-3,2);
		Assert.assertEquals(result, 9.0);
	}	
	
	@Test
	public void powerOfZero() {
		double result = calculator.pow(3,0);		
		Assert.assertEquals(result, 1.0);
	}	
	
	@Test
	public void baseZeroPower() {
		double result = calculator.pow(0,1);		
		Assert.assertEquals(result, 0.0);
	}	

}
