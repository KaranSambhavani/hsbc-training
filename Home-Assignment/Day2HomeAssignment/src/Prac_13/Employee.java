package Prac_13;

import java.util.*;
public class Employee {
	
	private int s[];
	private int n;
     
    MyCalculator ob=new MyCalculator();
    
    public Employee(int s[])
    {
    	this.s=s;
    	this.n=s.length;
    }
    public void totalSalary()
    {
   	 System.out.println(ob.add(s[0],s[1],s[2]));
    }
	public int[] getS() {
		return s;
	}
    
	
}
