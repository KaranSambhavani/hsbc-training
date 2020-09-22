package studentSerialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentSerialization {

	public static void storeIntoFile(Student s1[])
	{
		Student s[]=s1;
		ObjectOutputStream objOut=null;
		
		try {
			objOut=new ObjectOutputStream(new FileOutputStream("student.txt"));
			
			for(int i=0;i<s.length;i++)
			{
				if(s[i]!=null)
				{
					objOut.writeObject(s[i]);	
				}
			}
			
			
		} catch (FileNotFoundException e) {
			
			 System.out.println(e);
		} catch (IOException e) {	
			
			System.out.println(e);;
		}
		finally
		{
			try {
				if(objOut!=null)
				{
					objOut.close();
				}
				
			} catch (IOException e) {
				
				System.out.println(e);
			}
		}
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	        Student s[]=new Student[10];
			for(int i=0;i<s.length;i++)
			{
				s[i]=new Student(1+i,"Karan"+i,"9");
			}
			storeIntoFile(s);
			
	}

}
