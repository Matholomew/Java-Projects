package pbubblesort;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BubbleSortTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEVERYTHGIN() {
		BubbleSort bs = new BubbleSort();
		assertEquals(857, bs.getTax(746), 0.001);
		assertEquals("Hello there, Matthew", bs.greetings("Matthew"));
	}

}
