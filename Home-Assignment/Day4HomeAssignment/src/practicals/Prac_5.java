package practicals;
/**
 * 
 * @author Karan
 *
 *No,It is not necessary that an exception has to be handled by the same try-catch block that threw it.
 *Here in give Example we handle it from outer try catch block.
 */
public class Prac_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubtry
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
