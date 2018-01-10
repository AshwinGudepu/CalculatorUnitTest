package testng;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import org.testng.annotations.Test;

public class IsPositiveTest extends BaseCalculator {

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
