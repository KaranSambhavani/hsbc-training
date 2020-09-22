package com.demo.io.ser;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import com.demo.io.entity.Emp;

public class MyEmpSerializer {

	public static void main(String[] args) throws Exception {
		
		FileOutputStream fos=new FileOutputStream("emp.ser");
		ObjectOutputStream objout=new ObjectOutputStream(fos);
		
		for(int i=1;i<21;i++)
		{
			Emp emp=new Emp(100+i,"KP"+i,"Haidrabad"+i,65000+i);
			objout.writeObject(emp);
		}
		
		
		
		objout.close();

		System.out.println("Emp Serialized");
	}

}
