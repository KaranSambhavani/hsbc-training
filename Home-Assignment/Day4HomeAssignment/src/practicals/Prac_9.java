package practicals;
/**
 * 
 * @author Karan
 *
 */
public class Prac_9 {

	public static void main(String[] args) {
		try
		{
			try
			{
				String s[]=new String[5];
				System.out.println(s[2].length());
			}
			catch (ArithmeticException e) {
				
				System.out.println(e.getMessage());
			}
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Done successfully");
		}

	}

}
