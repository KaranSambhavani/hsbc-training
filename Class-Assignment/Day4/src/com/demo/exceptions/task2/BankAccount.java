package com.demo.exceptions.task2;



public class BankAccount {

	private double balance;

	public BankAccount(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdrow(double amount) throws LowBalanceException
	{
		try
		{
			if(balance<amount)
			{
				throw new LowBalanceException();
			}
			else
			{
				balance=balance-amount;
				System.out.println("Transaction successfull "+balance);
			}
		}
		catch(LowBalanceException e)
		{
			System.out.println(e);
			throw e;
		}
	}
}
