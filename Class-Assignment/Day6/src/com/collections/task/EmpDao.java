package com.collections.task;

import java.util.HashSet;
import java.util.Iterator;

import com.demo.training.entity.Emp;

public class EmpDao {

	HashSet<Emp> hs=new HashSet<Emp>();
			
	public void save(Emp e)
	{
		hs.add(e);
	}
	public void remove(Emp e)
	{
		hs.remove(e);
	}
	
	public Emp getEmpById(int id)
	{
		Iterator<Emp> itr=hs.iterator();
		
		while(itr.hasNext())
		{
			Emp ob=itr.next();
			
			if(ob.getEmpId()==id)
			{
				return ob;
			}
		
		}
		return null;
		
	}
	public void display() {
		Iterator<Emp> itr=hs.iterator();
				
		while(itr.hasNext())
		{
			Emp ob=itr.next();
					
			System.out.println(ob.getInfo());
		}
		
	}
	
}
