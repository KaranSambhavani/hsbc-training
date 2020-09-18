package com.demo.inheritance.demo2;

public abstract class Figure {

	 protected int dim1;
	 protected int dim2;
	public Figure(int dim1, int dim2) {
		super();
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public Figure(int dim1) {
		super();
		this.dim1 = dim1;
		
	}
	
	abstract public double area();
	 
	
}
