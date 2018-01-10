package testng;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class IsNegativeTest extends BaseCalculator {

	@BeforeMethod
	public void isNegativeBeforeAnnotation() {
		System.out.println("Before Method");
		calculator = null;
		calculator = new Calculator();		
	}

	@Test
	public void isNegative() {
		boolean result = calculator.isNegative(-123);
		assertTrue(result);
	}

	@Test
	public void isPositve() {
		boolean result = calculator.isNegative(123);
		assertFalse(result);
	}

	@AfterMethod
	public void isNegativeAfterAnnotation() {
		System.out.println("After Method");
		calculator = null;		
	}
}
