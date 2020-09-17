package Empfolder;

import java.awt.List;
import java.util.ArrayList;

public class MainEmp {

	public static void main(String[] args) {
		
		Emp ob[]=new Emp[10];
	
		ob[0]=new Emp(1,"Karan");
		ob[1]=new Emp(2,"Karan2");
		
	
		EmpDb ed=new EmpDb();
		ed.addEmp(ob[0]);
		ed.addEmp(ob[1]);
		
		
		ed.display();
		Emp searchedEmp=ed.search(2);
		System.out.println(searchedEmp.getEmpId()+" "+searchedEmp.getEmpName());
		

	}

}
