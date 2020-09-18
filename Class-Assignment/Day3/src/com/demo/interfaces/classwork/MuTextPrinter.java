package com.demo.interfaces.classwork;

public class MuTextPrinter {

	Writer writer;

	public MuTextPrinter(Writer writer) {
		super();
		this.writer = writer;
	}
	
	public void printText(String message)
	{
		System.out.println(writer.write(message));
	}
	
	
}
