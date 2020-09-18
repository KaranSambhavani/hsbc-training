package org.demo.tools;

public class Calculator {

	public int a;
	public int b;
	public Calculator(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	public int  add()
	{
		return a+b;
	}
	public int subtract()
	{
		return a-b;
	}
	
	public int multiply() {
		return a*b;
	}
	
	
	
}
