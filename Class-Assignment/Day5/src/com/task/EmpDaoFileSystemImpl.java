package com.task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import com.demo.io.entity.Emp;

/**
 * 
 * @author Karan
 *
 */
public class EmpDaoFileSystemImpl implements EmpDao{

	@Override
	public String save(Emp e) throws EmpAlreadyExist {
		
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		FileReader fr=null;
		BufferedReader br=null;
		try
		{
			fw=new FileWriter("EmpInfo.txt",true);
			bw=new BufferedWriter(fw);
			
			fr=new FileReader("EmpInfo.txt");
			br=new BufferedReader(fr);
			
			String line="";
			
			while((line=br.readLine())!=null)
			{
				String s1[]=line.split(",");
				if(s1[0].equals((String.valueOf(e.getEmpId()))))
				{
				  throw new EmpAlreadyExist("This Emp is already Registered");	
				 // return "This Emp is already Registered";	
				}
				
			}
			String s=e.getInfo();
			bw.write(s);
			bw.write("\n");
			return "Data saved successfully";
			
			
			
		}
		catch(EmpAlreadyExist ea)
		{
			//System.out.println(ea.getMessage());
			throw ea;
		}
		catch(IOException ioe)
		{
			System.out.println(ioe);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		finally
		{
			try
			{
				if(bw!=null)
				{
					bw.close();
				}
				if(br!=null)
				{
					br.close();
				}
			}
			catch(IOException io)
			{
				System.out.println(io);
			}
			
		}
		return null;
	}

}
