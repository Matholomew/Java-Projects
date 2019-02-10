package pbankccount;

public class BankAccount {
	
	private double balance;
	
	public BankAccount() 
	{
		balance = 0;
	}
	
	public BankAccount(double i) 
	{
		balance = i;
	}
	
	public double getBalance() 
	{
		return balance;
	}
	
	public void setBalance(double i)
	{
		balance = i;
	}
	public void deposit(double i)
	{
		balance += i;
	}
	
	public void withdraw(double i)
	{
		balance -= i;
		if(balance < 0)
		{
			balance -= 5;
		}
	}
	
	public void addInterest()
	{
		double interest = balance * 0.05;
		double tax = interest * 0.33;
		balance = balance + interest - tax;
	}

}
