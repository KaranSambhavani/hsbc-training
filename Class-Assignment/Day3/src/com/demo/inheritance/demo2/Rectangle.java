package com.demo.inheritance.demo2;

public class Rectangle extends Figure{

	public Rectangle(int dim1, int dim2) {
		super(dim1, dim2);
		// TODO Auto-generated constructor stub
	}

	public double area()
	{
		return dim1*dim2;
	}
	
}
