package com.demo.inheritance.demo1;

public class TraineeEmployee extends Employee {
   
	private String performance;

	public TraineeEmployee(int id, String name, double salary, String performance) {
		super(id, name, salary);
		this.performance = performance;
	}
	
	public String getDetails()
	{
		return super.getDetails()+" "+performance;
	}
	
	
}
