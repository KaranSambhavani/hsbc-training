package com.task;

import java.util.Scanner;
/**
 * 
 * @author Karan
 *
 */
public class EmpApp {

	public static void main(String[] args) {
		
		EmpDao ed=new EmpDaoFileSystemImpl();
		EmpService es=new EmpService(ed);
		
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter Details");
			int id=sc.nextInt();
			String name=sc.next();
			String city=sc.next();
			double sal=sc.nextDouble();
			System.out.println(es.RegisterEmp(id,name,city,sal));
		}
		
	
	}

}
