package 강의자료;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class CaculatorTest {

	@Test
	void testAdd() {
		Caculator calculator = new Caculator();
		assertEquals(3, calculator.add(1, 2));
	}

	@Test
	void testSubtrack() {
		Caculator calculator = new Caculator();
		assertEquals(3,calculator.subtrack(4, 1));
	}

	@Test
	void testMultiply() {
		Caculator calculator = new Caculator();
		assertEquals(6, calculator.multiply(2, 3));
	}

	@Test
	void testDivide() {
		Caculator calculator = new Caculator();
		assertEquals(4, calculator.divide(8, 2));
	}

	@Test
	void testMain() {
		fail("Not yet implemented");
	}

}
