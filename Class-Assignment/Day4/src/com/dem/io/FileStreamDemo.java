package com.dem.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreamDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		File file=null;
		FileInputStream fis=null;
		FileOutputStream out=null;
		try
		{
			file=new File("F:\\Io\\temp\\demo.txt");
			fis=new FileInputStream(file);
		    out=new FileOutputStream("F:\\Io\\temp\\demo1.txt");
			
			int data=0;
			while((data=fis.read())!=-1)
			{
				System.out.print((char)data);
				out.write(data);
				
				
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			
			
			try {
			if(fis!=null)
			{
				fis.close();
			}
			if(out!=null)
			{
				out.close();
			}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
	}

}
