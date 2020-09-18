package com.demo.inheritance.demo1;

public class Employee extends Person {
 
	private double salary;
	
	public Employee(int id,String name,double salary) {
	
		super(id,name);
		this.salary=salary;
		
      }
	
	public String getDetails()
	{
		return super.getDetails()+" "+salary;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is "+this.getClass().getSimpleName()+" Class";
	}
	
}
