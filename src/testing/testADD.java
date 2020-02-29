package testing;

import static org.junit.jupiter.api.Assertions.*;

import javasrc.Calculator;

import org.junit.jupiter.api.Test;

class testADD {

	@Test
	void test() {
		
		assertEquals(11, Calculator.add(7,4));
	}

}
