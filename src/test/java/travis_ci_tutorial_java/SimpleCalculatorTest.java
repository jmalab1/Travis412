package travis_ci_tutorial_java;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	
	private SimpleCalculator calc = new SimpleCalculator();
		
	@Test
	public void testAdd() {
		assertEquals(this.calc.add(1, 1), 2);
	}
	
	@Test
	public void testMinus() {
		assertEquals(this.calc.minus(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		assertEquals(this.calc.multiply(2, 2), 4);
	}
	
	@Test
	public void testDivide() {
		assertEquals(this.calc.divide(4, 2), 2);
	}
}
