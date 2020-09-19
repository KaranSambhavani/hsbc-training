package com.demo.exceptions.task;

public class App2 {

	public int divide(int a,int b)
	{
		int ans=0;
		try {
			ans=a/b;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception occoured ");
			throw e;
		}
		return ans;
	}
}
