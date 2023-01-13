import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * A JUnit test class for the Person class.
 */
public class PersonTest {

  private Person john;
  /**
   * Create a person object for test
   */
  @Before
  public void setUp() {

    john = new Person("john", "doe", 1989);
  }
  /**
   * Test the getFirstName method
   */
  @Test
  public void testFirst() {
    assertEquals("john", john.getFirstName());
  }
  /**
   * Test the getLastName method
   */
  @Test
  public void testSecond() {
    assertEquals("doe", john.getLastName());
  }
  /**
   * Test the getYearOfBirth method
   */
  @Test
  public void testYearOfBirth() {
    assertEquals(1989, john.getYearOfBirth());
  }

}
