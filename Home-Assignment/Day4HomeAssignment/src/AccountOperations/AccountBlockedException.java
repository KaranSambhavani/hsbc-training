package AccountOperations;

public class AccountBlockedException extends Exception {

	@Override
	public String toString() {
		
		return "Account is BLocked";
	}
}
