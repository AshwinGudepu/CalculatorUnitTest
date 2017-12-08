package testng;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class IsNegativeTest extends BaseCalculator {	
	
	@BeforeSuite
	public void setUp(){
		calculator=new Calculator();		
	}
	
	@Test
	public void isNegative(){
		boolean result=calculator.isNegative(-123);
		assertEquals(result, true);
	}
	
	@Test
	public void isPositve(){
		boolean result=calculator.isNegative(123);
		assertEquals(result, false);
	}
}
