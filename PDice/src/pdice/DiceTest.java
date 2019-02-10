package pdice;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DiceTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void Rolltest() {
		Dice dice = new Dice();
		assertEquals(dice.roll() , dice.getFaceValue());
	}
	
	@Test
	public void setDicetest() {
		Dice dice = new Dice();
		dice.setFaceValue(5);
		assertEquals(5, dice.getFaceValue());
	}
	
	@Test
	public void Stringtest() {
		Dice dice = new Dice();
		assertEquals("1", dice.toString());
	}
}
