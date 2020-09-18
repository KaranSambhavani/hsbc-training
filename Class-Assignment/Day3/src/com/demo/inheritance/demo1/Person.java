package com.demo.inheritance.demo1;

public class Person {

	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public String getDetails()
	{
		return id+" "+name;
	}
	
}
