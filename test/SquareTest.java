/**********
 Name: Yue Liu
 Assignment: Lab 0 Part 6
 Date: 01/11/2023
 Notes: This file is to check the currency of Square class
 **********/
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SquareTest {
	private Square small;
	/**
	 * Create a square object for test
	 */
	@Before
	public void setUp() {
		small=new Square(5);
	}
	/**
	 * Test the get perimeter method.
	 */
	@Test
	public void testGetPerimeter() {
		assertEquals(20,small.getPerimeter());
	}
	/**
	 * Test the get area method.
	 */
	@Test
	public void testGetArea() {
		assertEquals(25,small.getArea());
	}
}
