package com.demo.exceptions;

public class ExceptonDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Start of the program");
		try
		{
			int a[]= {1,2,3,4};
			//System.out.println(a[4]);
			
			String s[]=new String[5];
			//System.out.println(s[2].length());
			throw new RuntimeException();
			
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			//System.out.println(e);
			System.out.println(e.getMessage());
			
		}
		catch(NullPointerException e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("This is Finally block");
		}
		System.out.println("End of the program");

	}

}
