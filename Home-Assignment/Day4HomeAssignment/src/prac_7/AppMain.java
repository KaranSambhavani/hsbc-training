package prac_7;
/**
 * 
 * @author Karan
 *
 *Here when constructor throws an exception tnen we have to handle it where we invoke the constructor. 
 */
public class AppMain {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			Constructor ob=new Constructor();	
		}
		catch(ArithmeticException e) {
			System.out.println("Exception: "+e);
		}
		

	}

}
