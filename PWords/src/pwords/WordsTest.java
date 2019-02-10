package pwords;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordsTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void reverseTest() {
		Words word = new Words("Hello");
		assertEquals("olleH", word.reverseWords());
	}
	
	@Test
	public void extractTest() {
		Words word = new Words("Hello * my * name * is * Matthew");
		assertEquals("Hello * my * name * is * Matthew", word.getMessage());
	}

}
