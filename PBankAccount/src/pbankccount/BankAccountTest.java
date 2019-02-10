package pbankccount;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testBankAccount() {
		
	}

	@Test
	public void testBankAccountInt() {
		
	}

	@Test
	public void testGetBalance() {
		//Create bank account
		BankAccount acc = new BankAccount();
		assertEquals(0, acc.getBalance(), 0.001);
				//Expected - Actual - Delta
	}

	@Test
	public void testDeposit() {
		//Create bank account
		BankAccount acc = new BankAccount();
		//Deposit 100
		acc.deposit(100);
		assertEquals(100, acc.getBalance(), 0.001);
		//Add another 50
		acc.deposit(50);
		assertEquals(150, acc.getBalance(), 0.001);
	}
	
	@Test 
	public void testSetBalance() {
		BankAccount acc = new BankAccount();
		acc.setBalance(66);
		assertEquals(66, acc.getBalance(), 0.001);
	}

	@Test
	public void testWithdraw() {
		BankAccount acc = new BankAccount();
		acc.withdraw(50);
		assertEquals(acc.getBalance(), -55, 0.001);
	}
	
	@Test
	public void testWithdrawWithPenalty() {
		BankAccount acc = new BankAccount();
		acc.deposit(100);
		acc.withdraw(150);
		assertEquals(-55, acc.getBalance(), 0.001);
	}
	
	@Test
	public void testInterest() {
		BankAccount acc = new BankAccount();
		acc.addInterest();
		assertEquals(1000, 1000, 0.001);
	}

}
