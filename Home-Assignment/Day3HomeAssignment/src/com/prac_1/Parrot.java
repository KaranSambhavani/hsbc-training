package com.prac_1;

public class Parrot extends Bird {

	public Parrot(String name) {
		this.name=name;
	
	}

	@Override
	public void display() {
		System.out.println("This is "+this.name);

	}

}
