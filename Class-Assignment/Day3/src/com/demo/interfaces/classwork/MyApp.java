package com.demo.interfaces.classwork;

public class MyApp {

	public static void main(String[] args) {
	
		Writer con=new PlainTextWriter();
		System.out.println(con.write("This returns Plaintext"));
		
		Writer con1=new DecoratedWriter();
		System.out.println(con1.write("This returns DecoretedText"));
		
		Writer con2=new HTMLWriter();
		System.out.println(con2.write("This returns HtMlText"));
		
		
		Writer mf= MyWriterFactory.getWriter("plain");
		System.out.println(con.write("This returns Plaintext"));

		/*MuTextPrinter ob=new MuTextPrinter(con);
		ob.printText("This returns Plaintext");
		
		MuTextPrinter ob1=new MuTextPrinter(con1);
		ob.printText("This returns DecoretedText");
		
		MuTextPrinter ob2=new MuTextPrinter(con2);
		ob.printText("This returns HtMlText");*/
		
	}

}
