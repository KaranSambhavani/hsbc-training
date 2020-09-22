package com.demo.io.data;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 * @author Karan
 *
 */
public class ReadFromKB {

	public static void main(String[] args) throws IOException {
		

		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		String s="";
		System.out.println("Enter exit to exit");
		while(!(s=br.readLine()).equals("exit"))
		{
			System.out.println(s);
		}
		
		
	}

}
