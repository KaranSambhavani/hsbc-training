package studentSerialization;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.ObjectInputStream;


public class StudentDeserialization {

	public static void getStudentsFromFile()
	{
	     
		  ObjectInputStream objIn=null;
	      
			
			try {
				objIn=new ObjectInputStream(new FileInputStream("student.txt"));
				
				while(true)
				{
					Student s=(Student)objIn.readObject();
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
	
	public static void main(String[] args) {
		
		getStudentsFromFile();
      		
	}

}
