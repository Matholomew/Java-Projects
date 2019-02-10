package testproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MultiplyTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMultiplacation() {
		JUnit test = new JUnit();
		int result = test.multiply(3, 4);
		assertEquals(12, result);
	}

}
