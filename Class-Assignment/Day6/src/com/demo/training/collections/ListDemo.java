package com.demo.training.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> as=new ArrayList<>();
		
		as.add("Karan");
		as.add("Harshad");
		as.add("Jp");
		as.add("Jk");
		
		Collections.sort(as,new MyListOrder());
		System.out.println(as);

	}

	
}
class MyListOrder implements Comparator<String>
{

	@Override
	public int compare(String o1, String o2) {
		
		return o2.compareTo(o1);
	}
	
}
