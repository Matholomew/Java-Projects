package psalary;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SalaryTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSalary() {
		Salary salary = new Salary(-10);
		assertEquals(0, salary.getTax(), 0.001);
	}

	@Test
	public void testGetGross() {
		
	}

	@Test
	public void testSetGross() {
		Salary sal = new Salary(100000);
		sal.setGross(50000);
		assertEquals(50000, sal.getGross(), 0.001);
	}

	@Test
	public void testGetTax() {
		Salary sal = new Salary(100000);
		assertEquals(23920, sal.getTax(), 0.001);
		sal.setGross(50000);
		assertEquals(8020, sal.getTax(), 0.001);
		sal.setGross(20000);
		assertEquals(2520, sal.getTax(), 0.001);
		sal.setGross(5000);
		assertEquals(525, sal.getTax(), 0.001);
		sal.setGross(0);
		assertEquals(0, sal.getTax(), 0.001);
		sal.setGross(-5000);
		assertEquals(0, sal.getTax(), 0.001);
		sal.getGross();
	}

	@Test
	public void testGetNet() {
		Salary sal = new Salary(100000);
		sal.getNet();
		assertEquals(76080, sal.getNet(), 0.001);
	}
	
	@Test
    public void dalesTestSuiteForTax()
    {
	//the instructor's test suite for tax
	Salary money = new Salary(120000.50);
	assertEquals(30520.17, money.getTax(),0.01);
	money.setGross(52112);
	assertEquals(8653.6, money.getTax(),0.01);
	money.setGross(44567);
	assertEquals(6819.23, money.getTax(),0.01);
	money.setGross(7623);
	assertEquals(800.42, money.getTax(),0.01);
	//a couple more tests
	//these would normally be in separate methods
	//test the net
	assertEquals(6822.59, money.getNet(),0.01);
	//test a negative
	money.setGross(-50);
	assertEquals(0, money.getTax(),0.01);
    }

}
