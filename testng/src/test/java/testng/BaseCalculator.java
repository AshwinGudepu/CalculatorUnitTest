package testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.epam.tat.module4.Calculator;

public class BaseCalculator {

		public Calculator calculator;
		
		@BeforeClass
		public void setUp(){
			calculator=new Calculator();		
		}
}
