package com.demo.io.ser;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.lang.reflect.Field;

import com.demo.io.entity.Emp;

public class MyEmpDeSerializer {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileInputStream fin=new FileInputStream("emp.ser");
		ObjectInputStream obj=new ObjectInputStream(fin);
		
		try
		{
			while(true)
			{
				Object o=obj.readObject();
				System.out.println(o.getClass().getName());
			
				Emp e=(Emp)o;
				System.out.println(e.getEmpId()+" "+e.getName()+" "+e.getCity()+" "+e.getSalary());	
			}
		}
		catch(EOFException e)
		{
			System.out.println("Read successfully");
		}
		obj.close();
		
	}

}
