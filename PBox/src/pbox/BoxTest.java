package pbox;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BoxTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testVolume() {
		Box box = new Box(10);
		assertEquals(1000, box.calcVolume(), 0.001);
	}
	
	@Test
	public void testSurface() {
		Box box = new Box(32);
		assertEquals(6144, box.getSurface(), 0.001);
	}

}
