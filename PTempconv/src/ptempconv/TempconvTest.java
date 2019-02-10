package ptempconv;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TempconvTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void setCelTest() {
		Tempconv value = new Tempconv();
		value.setCel(27);
		assertEquals(80.6, value.getFah(), 0.001);
		assertEquals(300.15, value.getKel(), 0.001);
		assertEquals(27, value.getCel(), 0.001);
	}
	
	@Test
	public void setFahTest() {
		Tempconv value = new Tempconv();
		value.setFah(67);
		assertEquals(19.44444444443, value.getCel(), 0.001);
		assertEquals(292.594444443, value.getKel(), 0.001);
		assertEquals(67, value.getFah(), 0.001);
	}
	
	@Test
	public void setKelTest() {
		Tempconv value = new Tempconv();
		value.setKel(396);
		assertEquals(122.8500000, value.getCel(), 0.001);
		assertEquals(396, value.getKel(), 0.001);
		assertEquals(253.1300, value.getFah(), 0.001);
	}
	
	@Test
	public void toStringTest() {
		Tempconv value = new Tempconv();
		value.setCel(50);
		assertEquals("The temperatures are 50.0 celcius, 122.0 fahrenheit and 323.15 kelvin", value.toString());
	}

}
