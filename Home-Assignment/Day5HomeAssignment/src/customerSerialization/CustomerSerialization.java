package customerSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;



public class CustomerSerialization {

	public static void main(String[] args) {
		FileOutputStream fos;
		ObjectOutputStream objout=null;
		try {
			fos = new FileOutputStream("customer.ser");
			objout=new ObjectOutputStream(fos);
			
			Scanner sc=new Scanner (System.in);
			for(int i=0;i<3;i++)
			{
				System.out.println("Enter Details");
				int id=sc.nextInt();
				String name=sc.next();
				sc.nextLine();
				
				String addr=sc.nextLine();
				
				Customer e=new Customer(id, name, addr);
				objout.writeObject(e);
						
						
			}
			
		} catch (FileNotFoundException e) {
			
			
		} catch (IOException e) {
			
		}
		finally
		{
			try {
				if(objout!=null)
				{
					objout.close();
				}
				
			} catch (IOException e) {
				
				System.out.println(e);
			}
		}

		System.out.println("Emp Serialized");

	}

}
