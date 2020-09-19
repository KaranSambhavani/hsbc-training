package com.demo.exceptions.task2;

public class MainApp {

	public static void main(String[] args) {
		BankAccount ob=new BankAccount(500);
		
		try
		{
			ob.withdrow(50);
			ob.withdrow(600);
		}
		catch(Exception e)
		{
			System.out.println("In main method");
		}
		

		System.out.println("Done Successfully");
	}

}
