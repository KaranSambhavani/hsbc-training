package prac_8;
/**
 * 
 * @author Karan
 *
 */
public class MainApp {

	public static void main(String[] args) throws MyNullPointerException {
		
		try
		{
			try
			{
				String s[]=new String[5];
				System.out.println(s[2].length());
			}
			catch (NullPointerException e) {
				
				throw new MyNullPointerException("My Null Pointer Exception occured");
			}
		}
		catch(MyNullPointerException e)
		{
			System.out.println(e.getMessage());
		}
	
		finally
		{
			System.out.println("Done Successfully");
		}
		
	}
}
