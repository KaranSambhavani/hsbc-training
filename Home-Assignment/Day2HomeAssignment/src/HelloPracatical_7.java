/**
 * 
 * @author Karan Sambhavanee
 *
 */

public class HelloPracatical_7 {

	/**
	 * 
	 * @param i
	 * In this program int method will be called because we pass int as a argument when we call.
	 */
	public void hello(int i)
	{
		System.out.println("Int method is called");
		
	}
	public void hello(byte i)
	{
		System.out.println("Byte method is called");
		
	}
	public void hello(short i)
	{
		System.out.println("Short method is called");
		
	}
	public void hello(long i)
	{
		System.out.println("Long method is called");
		
	}
	public static void main(String[] args) {
	  
		HelloPracatical_7 ob=new HelloPracatical_7();
		ob.hello(5);
		
	}
}
