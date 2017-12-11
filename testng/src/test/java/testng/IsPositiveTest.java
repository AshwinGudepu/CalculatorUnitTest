package testng;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import com.epam.tat.module4.Calculator;

public class IsPositiveTest extends BaseCalculator {

	@BeforeSuite
	public void setUp() {
		calculator = new Calculator();
	}

	@Test
	public void isPositve() {
		boolean result = calculator.isPositive(123);
		assertTrue(result);
	}

	@Test
	public void isNegative() {
		boolean result = calculator.isPositive(-123);
		assertFalse(result);
	}
}
