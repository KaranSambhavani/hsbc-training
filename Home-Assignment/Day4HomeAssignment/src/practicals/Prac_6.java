package practicals;

/**
 * 
 * @author Karan
 *
 * If we catch exception By (Exception class) as give below then, 
 * We can make sure that we catch every exception that a statement may throw.
 */
public class Prac_6 {

	public static void main(String[] args) {
		try {
			int a=5;
			int b=0;
			System.out.println(a/b);
			
			int arr[]={1,2,3};
			System.out.println(arr[5]);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		

	}

}
