package com.demo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	/**
	 * all these method is static so we make a static import to make our code more
	 * readable not to write the name o the class before each method.
	 */
	@Test
	void test() {

		// success when the left hand side and the right hand side are the same.
		assertEquals(1, 1);

		boolean condition = true;
		assertEquals(true, condition);

		// success when the supplied condition is true just shortcut for assertEquals
		// method with
		// expected is always true
		assertTrue(condition);

		// success when the supplied condition is false.
		assertFalse(!condition);

		// success when the left hand side and the right hand side are not the same.
		assertNotEquals(1, 2);
		
		// // success when two arrays are the same (length,type,value and order)
		assertArrayEquals(new int [] {3,4,5}, new int [] {3,4,5});
	}

}
