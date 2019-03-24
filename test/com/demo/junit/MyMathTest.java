package com.demo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();

	/**
	 * first rule in unit test Absence of failure is success.
	 */
	// MyMath.sum 1,2,3 => 6
	@Test
	void sum_with3numers() {

		// check that the result is 6
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
		// fail("Not yet implemented");
	}

	@Test
	public void sum_with1number() {
		assertEquals(5, myMath.sum(new int[] { 5 }));
	}
}
