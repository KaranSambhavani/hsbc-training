package com.demo.exceptions.task;

public class App1 {
  
	App2 ob;

	public App1(App2 ob) {
		super();
		this.ob = ob;
	}
	
	public int calculate(int a,int b)
	{
		return ob.divide(a, b);
	}
	
	
}
