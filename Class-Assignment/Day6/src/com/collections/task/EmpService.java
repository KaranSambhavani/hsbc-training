package com.collections.task;

import com.demo.training.entity.Emp;

public class EmpService {

	private EmpDao ed;

	public EmpService(EmpDao ed) {
		super();
		this.ed = ed;
	}
	
	
	public void register(Emp e)
	{
		ed.save(e);
	}
	
	
	public void deleteById(int id)
	{
	 Emp e=ed.getEmpById(id);
	 ed.remove(e);
	 
	}
	public void display()
	{
		ed.display();
	}
	
}
