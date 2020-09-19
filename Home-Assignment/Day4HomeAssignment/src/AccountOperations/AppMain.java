package AccountOperations;
/**
 * 
 * @author Karan
 *
 */
public class AppMain {

	public static void main(String[] args) {
		
		
		try {
			Account ob=new Account(10000);
			try {
				System.out.println(ob.getBalance());
			} catch (AccountBlockedException e) {
				
				System.out.println(e);
			}
			
			try {
				ob.deposite(1000);
			} catch (AccountBlockedException e) {
				
				System.out.println(e);
			}
			
			try {
				System.out.println(ob.getBalance());
			} catch (AccountBlockedException e) {
				
				System.out.println(e);
			}
			
			try {
				ob.withdraw(12000);
			} catch (AccountBlockedException | InsufficientBalanceException e) {
				
				System.out.println(e);
			}
			
			
			try {
				System.out.println(ob.getBalance());
			} catch (AccountBlockedException e) {
				
			   System.out.println(e);
			}
			
			try {
				ob.withdraw(500);
			} catch (AccountBlockedException | InsufficientBalanceException e) {
				
				System.out.println(e);
			}
			try {
				System.out.println(ob.getBalance());
			} catch (AccountBlockedException e) {
				
				System.out.println(e);
			}
			
			
			ob.blockAccount();
			
			
			
			try {
				ob.getBalance();
			} catch (AccountBlockedException e) {
				
				System.out.println(e);
			}
			try {
				ob.deposite(4000);
			} catch (AccountBlockedException e) {
				
				System.out.println(e);
			}
			try {
				ob.getBalance();
			} catch (AccountBlockedException e) {
				
				System.out.println(e);
			}	
			
		} 
		
		finally
		{
			System.out.println("This is Finally block");
		}
		
		

	}

}
