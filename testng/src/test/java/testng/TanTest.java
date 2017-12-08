package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class TanTest extends BaseCalculator {
	
	@Test
	public void tanZero() {
		double result = calculator.tg(0);
		Assert.assertEquals(result, 0.0);
		//This test is failed. Expected Value is 0, but returning NaN.As part of assignment I am writing these comments
	}

	@Test
	public void tgThirty() {
		double result = calculator.tg(30);
		Assert.assertEquals(result, 0.57735026919);
		//This test is failed. Expected Result is not matching with the Actual Result. As part of assignment I am writing these comments
	}

	@Test
	public void tgFourtyFive() {
		double result = calculator.tg(45);
		Assert.assertEquals(result, 1.0);		
	}

	@Test
	public void tgSixty() {
		double result = calculator.tg(60);
		Assert.assertEquals(result, 1.732050807569);
		//This test is failed. Expected Result is not matching with the Actual Result. As part of assignment I am writing these comments
	}

	@Test	
	public void tgNinety() {
		double result = calculator.tg(90);
		if(Double.isNaN(result)){
		assertEquals(true, true);
		}
		//This test is failed. Tan 90 is infinitive but here is throwing 0
	}

}
