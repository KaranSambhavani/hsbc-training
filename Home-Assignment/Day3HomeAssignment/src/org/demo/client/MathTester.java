package org.demo.client;

import org.demo.tools.Calculator;

/**
 * 
 * @author Karan
 *
 */
public class MathTester {

	public static void main(String args[]) {
		
		Calculator ob=new Calculator(10,4);
		System.out.println("Add: "+ob.add());
		System.out.println("Subtract: "+ob.subtract());
		System.out.println("Multiply: "+ob.multiply());

	}
}
