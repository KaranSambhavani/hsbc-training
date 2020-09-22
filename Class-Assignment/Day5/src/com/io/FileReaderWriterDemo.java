package com.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author Karan
 *
 */
public class FileReaderWriterDemo {

	public static void main(String[] args){
		// TODO Auto-generated method stub

		
		FileWriter out=null;
		
		BufferedWriter bout=null;
		try
		{
			
			
           out=new FileWriter("F:\\Io\\temp\\demo1.txt");
		    bout=new BufferedWriter(out);
			
			String s[]=new String[20];
			s[0]="Ganesh Chaturthi is a Hindu festival which is celebrated every year especially in Maharashtra and Karnataka.";
			s[1]="Ganesh Chaturthi is celebrated as the birth anniversary of Lord Shiv’s son Ganesh.";
			s[2]="Ganesh Chaturthi is celebrated in the month of August-September every year.";
			s[3]="In Hindu mythology, Lord Ganesh is “Pratham Pujya” i.e. worshiped first among all.";
			s[4]="Lord Ganesh is also considered as “Vighna Harta” i.e. one who removes all the obstacles.";
			s[5]="Prior to starting any big, important and religious work, people first remember Lord Ganesh.";
			s[6]="In order to get rid of all troubles and obstacles, people worship and remember Lord Ganesh.";
			s[7]="During Ganesh Chaturthi, people bring Ganapati idol in their homes and worship it with full devotion.";
			s[8]="Various trusts and societies also set up big ‘pandals’ for worshiping Lord Ganesh in the city.";
			s[9]="Even famous film stars also celebrate Ganesh Chaturthi and bring Ganapati idols to their home.";
	
			for(int i=0;i<10;i++)
			{
				System.out.println(s[i]);
				bout.write(s[i]);
				bout.write("\n");
			
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			
			
			try {
		
			if(bout!=null)
			{
				bout.close();
			}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		}
	}

}
