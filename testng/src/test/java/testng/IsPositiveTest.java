package testng;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseCalculator {
	
	@Test
	public void isPositve(){
		boolean result=calculator.isPositive(123);
		assertEquals(result, true);
	}
	
	@Test
	public void isNegative(){
		boolean result=calculator.isPositive(-123);
		assertEquals(result, false);
	}
	
	

}
