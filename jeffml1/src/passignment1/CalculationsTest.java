package passignment1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

/**
 * JUnit test class to test the calculation methods
 * @author Matthew
 *
 */
public class CalculationsTest {

	/**
	 * Tests the maximum calculation method for year and export quantity
	 */
	@Test
	public void findMaxTest() {
		ArrayList<PaperExports> value = new ArrayList<PaperExports>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			PaperExports e = new PaperExports(rand.nextInt(2000), null, null, null, null, rand.nextInt(10000));
			value.add(e);
		}
		PaperExports e = new PaperExports(2001, null, null, null, null, 10001);
		value.add(e);
		assertEquals(2001, PaperExports.findMaxYear(value), 0.001);
		assertEquals(10001, PaperExports.findMaxExpQuan(value), 0.001);
	}
	
	/**
	 * Tests the minimum calculation method for year and export quantity
	 */
	@Test
	public void findMinTest() {
		ArrayList<PaperExports> value = new ArrayList<PaperExports>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			PaperExports e = new PaperExports(rand.nextInt(2000), null, null, null, null, rand.nextInt(10000));
			value.add(e);
		}
		PaperExports e = new PaperExports(1, null, null, null, null, 1);
		value.add(e);
		assertEquals(1, PaperExports.findMinYear(value), 0.001);
		assertEquals(1, PaperExports.findMinExpQuan(value), 0.001);
	}
	
	/**
	 * Tests the mode calculation method for year and export quantity
	 */
	@Test
	public void findModeTest() {
		ArrayList<PaperExports> value = new ArrayList<PaperExports>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			PaperExports e = new PaperExports(5, null, null, null, null, 7);
			value.add(e);
		}
		PaperExports e = new PaperExports(11, null, null, null, null, 4);
		value.add(e);
		PaperExports b = new PaperExports(45, null, null, null, null, 53);
		value.add(b);
		assertEquals(5, PaperExports.yearModeSort(value), 0.001);
		assertEquals(7, PaperExports.expQuanModeSort(value), 0.001);
	}
	
	/**
	 * Tests the median calculation method for year and export quantity
	 */
	@Test
	public void findMedianTest() {
		ArrayList<PaperExports> value = new ArrayList<PaperExports>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			PaperExports e = new PaperExports(i, null, null, null, null, i + 1);
			value.add(e);
		}
		PaperExports e = new PaperExports(1, null, null, null, null, 1);
		value.add(e);
		assertEquals(4, PaperExports.medianYearSort(value), 0.001);
		assertEquals(5, PaperExports.medianExpQuanSort(value), 0.001);
	}
	
	/**
	 * Tests the mean calculation method for year and export quantity
	 */
	@Test
	public void findMeanTest() {
		ArrayList<PaperExports> value = new ArrayList<PaperExports>();
		Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			PaperExports e = new PaperExports(i + 4, null, null, null, null, i + 1);
			value.add(e);
		}
		PaperExports e = new PaperExports(1, null, null, null, null, 1);
		value.add(e);
		assertEquals(7, PaperExports.meanYearSort(value), 0.001);
		assertEquals(5, PaperExports.meanExpQuanSort(value), 0.001);
	}
	

}
