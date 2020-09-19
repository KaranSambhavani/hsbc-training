package AccountOperations;
/**
 * 
 * @author Karan
 *
 */
public class Account implements AccountOperationsInterface {

	double balance;
	int isBlocked=0;
	
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double deposite(double amt) throws AccountBlockedException {
		
		try
		{
			if(isBlocked==1)
			{
				throw new AccountBlockedException();
			}
			else
			{
				balance=balance+amt;
				System.out.println("Deposite Successfull");
			}
		}
		catch(AccountBlockedException e)
		{
			throw e;	
		}
		
		return balance;
	}

	@Override
	public double withdraw(double amt) throws AccountBlockedException, InsufficientBalanceException {
		
		 try
		 {
			if(isBlocked==1)
			{
				throw new AccountBlockedException();
			}
			else if(balance<amt)
			{
				throw new InsufficientBalanceException();
			}
			else
			{
				balance=balance-amt;
				System.out.println("Withdraw Successfull");
				
			}
		 }
		 catch(AccountBlockedException e)
		 {
			 throw e;
		 }
		 catch(InsufficientBalanceException e)
		 {
			 throw e;
		 }
		return balance;
	}

	@Override
	public double getBalance() throws AccountBlockedException {
		
		 try
		 {
			if(isBlocked==1)
			{
				throw new AccountBlockedException();
			}
			else
			{
				System.out.print("Your Balance is: ");
				return balance;
			}
		 }
		 catch (AccountBlockedException e) {
			throw e;
		}
		 
	}

	@Override
	public void blockAccount() {
     
		isBlocked=1;

	}

}
