package com.demo.interfaces.classwork;

public class MyWriterFactory {

	public static Writer getWriter(String msg)
	{
		
		if(msg.equalsIgnoreCase("plain"))
		{
			return new PlainTextWriter();
		}
		else if(msg.equalsIgnoreCase("Decorated"))
		{
			return new DecoratedWriter();
			
		}
		else if(msg.equalsIgnoreCase("HTML"))
		{
			return new HTMLWriter();
		}
		else
		{
			return null;
		}
		
	}
}
