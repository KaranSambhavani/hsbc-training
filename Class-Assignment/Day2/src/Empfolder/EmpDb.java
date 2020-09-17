package Empfolder;

import java.awt.List;
import java.util.ArrayList;

public class EmpDb {

	ArrayList<Emp> l=new ArrayList<Emp>();
	
	public void addEmp(Emp e)
	{
		l.add(e);
	}
	
	
	public Emp search(int id)
	{
		Emp ob=new Emp();
		for(int i=0;i<l.size();i++)
		 {
			 if(l.get(i).getEmpId()==id)
			 {
				ob=(Emp)l.get(i);
			
			 }
		 }
		return ob;
	}
	
	public void display()
	{
	 for(int i=0;i<l.size();i++)
	 {
		 Emp e1=l.get(i);
		 System.out.print(e1.getEmpId()+" "+e1.getEmpName()); 
		 System.out.println();
	 }
	}
}
