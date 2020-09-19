package practicals;

/**
 * 
 * @author Karan
 * Yes,There can be a try block without catch but with only finally.
 */
public class Prac_4 {

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
