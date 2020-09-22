package com.demo.io.data;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 * @author Karan
 *
 */
public class ReadDataToFileWithDOS{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fos=null;
		BufferedInputStream bos=null;
		DataInputStream dos=null;

		
		try
		{
			fos=new FileInputStream("mydata.dat");
		    bos=new BufferedInputStream(fos);
			dos=new DataInputStream(bos);
			
			 while(true)
			 {
				int id=dos.readInt();
				String name=dos.readUTF();
				String city=dos.readUTF();
			    double salary=dos.readDouble();
			    System.out.println(id+" "+name+" "+city+" "+salary);
			 }  
		    
		}
		catch (FileNotFoundException e) {
			System.out.println(e);
		}
		catch(EOFException e)
		{
			System.out.println("Done Successfully");
		}
		catch (IOException e) {
			System.out.println(e);
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		dos.close();
		

	}

}
