package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import main.Calculator;

class CalculatorTest {

	@Test
	void testAdd() {

		Calculator cal = new Calculator();
		int actual = cal.add(4, 5);
		assertEquals(9, actual);

	}

	@Test
	void testSubtract() {
		Calculator cal = new Calculator();
		int actual = cal.subtract(9, 5);
		assertEquals(4, actual);

	}
	
	@Test
	void testDivide() {
		Calculator cal = new Calculator();
		int actual = cal.divide(9, 3);
		assertEquals(3, actual);

	}
	
	@Test
	void testMultiply() {
		Calculator cal = new Calculator();
		int actual = cal.multiply(9, 5);
		assertEquals(45, actual);

	}

}
