package com.prac_1;

public class Duck extends Bird {

	public Duck(String name) {
		this.name=name;
	
	}

	@Override
	public void display() {
		System.out.println("This is "+this.name);

	}

}
