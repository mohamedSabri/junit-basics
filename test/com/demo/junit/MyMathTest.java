package com.demo.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class MyMathTest {

	MyMath myMath = new MyMath();

	// the name of the method does not really matter.What matters is the annotation.
	/**
	 * The order is not really guaranteed in running of the tests,So we use the
	 * method which has @before annotation to run specific code before every test.
	 * 
	 * if you want to do something before run the test method like you want to
	 * initialize some data for the test.
	 */
	@Before
	public void before() {
		System.out.println("Before every test method ");
	}

	/**
	 * run after every test . if there is some Clean-Up that you would want to do
	 * after every test then you can do that in the after method.
	 */
	@After
	public void after() {
		System.out.println("After every test method ");

	}

	/**
	 * BeforeClass and AfterClass these are run once for every test class.
	 * 
	 * One of the things that you need to remember is the fact that before class and
	 * after class are class level methods.So they are applicable for the entire
	 * class and also class level,So in Junit before class and after class should be
	 * static method.
	 */

	/**
	 * things like establishing a database connection might be things that we were
	 * doing it in the method that has @BeforeClass annotation
	 */
	@BeforeClass
	public static void beforeClass() {
		System.out.println("Before Class ");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println("After Class ");
	}

	/**
	 * first rule in unit test Absence of failure is success.
	 */
	// MyMath.sum 1,2,3 => 6
	@Test
	void sum_with3numers() {

		System.err.println("Test 1");
		// check that the result is 6
		assertEquals(6, myMath.sum(new int[] { 1, 2, 3 }));
		// fail("Not yet implemented");
	}

	@Test
	public void sum_with1number() {
		System.err.println("Test 2");
		assertEquals(5, myMath.sum(new int[] { 5 }));
	}
}
