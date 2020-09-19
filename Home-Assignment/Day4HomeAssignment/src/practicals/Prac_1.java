package practicals;

/**
 * 
 * @author Karan
 *
 * Yes,There can be a try block without a matching catch block if use finally
 */
public class Prac_1 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			int a=5;
			int b=2;
			System.out.println(a/b);
		}
		finally {
			
			System.out.println("This is finally block");
		}
	}
	
}
