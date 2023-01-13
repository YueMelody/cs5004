/**********
 Name: Yue Liu
 Assignment: Lab 0 Part 6
 Date: 01/11/2023
 Notes: This file is to check the currency of Book class
 **********/

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {

	private Person john;
	private Book wind;
	
	/**
	 * Create a person object john and a book object wind for test.
	 */
	@Before
	public void setUp() {

	    john = new Person("john", "doe", 1989);
	    wind=new Book("wind",john,17.2f);
	}
	
	/**
	 * Test the get title method
	 */
	@Test
	public void testGetTitle() {
	    assertEquals("wind", wind.getTitle());
	}
	/**
	 * Test the get price method
	 */
	@Test
	public void testGetPrice() {
	    assertEquals(17.2f, wind.getPrice(),0.0f);
	}
	/**
	 * Test the get author method
	 */
	@Test
	public void testGetAuthor() {
	    assertEquals(john,wind.getAuthor());
	}

}
