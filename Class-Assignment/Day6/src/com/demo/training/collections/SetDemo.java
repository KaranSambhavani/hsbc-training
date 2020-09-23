package com.demo.training.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet<String> names=new HashSet<String>();
		names.add("Karan");
		names.add("Karan1");
		names.add("Karan2");
		names.add("Karan");
		
		System.out.println(names.contains("Karan"));
		
		names.remove("Karan1");
		System.out.println(names);
		
		names.add("Harshad");
		System.out.println(names);
		
		Iterator<String> itr=names.iterator();
		while(itr.hasNext())
		{
			System.out.println("Hi "+itr.next());
			
		}
		System.out.println(names);
	}

}
