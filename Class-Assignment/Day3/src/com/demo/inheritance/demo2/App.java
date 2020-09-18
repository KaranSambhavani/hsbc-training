package com.demo.inheritance.demo2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Figure ob1=new Triangle(3,5);
		System.out.println(ob1.area());
		
		Figure ob2=new Rectangle(3,5);
		System.out.println(ob2.area());
		
		
	}

}
