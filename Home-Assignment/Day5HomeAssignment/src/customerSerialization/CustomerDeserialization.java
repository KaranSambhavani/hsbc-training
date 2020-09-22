package customerSerialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class CustomerDeserialization {

	public static void main(String[] args) {
		 ObjectInputStream objIn=null;
	      
			
			try {
				objIn=new ObjectInputStream(new FileInputStream("customer.ser"));
				
				while(true)
				{
					Customer s=(Customer)objIn.readObject();
					System.out.println(s);
				}
				
				
			}catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			catch(EOFException e)
			{
				System.out.println("Done SuccessFully");
			}
			catch (FileNotFoundException e) {
				
				 System.out.println(e);
			} catch (IOException e) {	
				
				System.out.println(e);;
			}
			finally
			{
				try {
					if(objIn!=null)
					{
						objIn.close();
					}
					
				} catch (IOException e) {
					
					System.out.println(e);
				}
			}

	}

}
