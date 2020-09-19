package practicals;

/**
 * 
 * @author Karan
 *Yes,there can be a catch block without a matching try block as  given below.
 *ArrayIndexOutOfBoundsException
 */
public class Prac_2 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		try
		{
			int a=10;
			int b=0;
			System.out.println(a/b);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
