package AccountOperations;

public class InsufficientBalanceException extends Exception {

	@Override
	public String toString() {
	
		return "Your Account balance is Insufficient";
	}
}
