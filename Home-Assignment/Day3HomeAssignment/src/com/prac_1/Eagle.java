package com.prac_1;

public class Eagle extends Bird {

	public Eagle(String name) {
		this.name=name;
	
	}

	@Override
	public void display() {
		System.out.println("This is "+this.name);

	}

}
