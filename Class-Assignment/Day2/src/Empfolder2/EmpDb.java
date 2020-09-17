package Empfolder2;



public class EmpDb {

	Emp EmpList[]=new Emp[10];
	
	int i=0;
	public void addEmp(Emp e)
	{
		if(i==EmpList.length)
		{
			System.out.println("Full");
		}
		else
		{
			EmpList[i]=e;
			System.out.println("Emp added");
			i++;
		}
	}
	public void display()
	{
	
		for(int i=0;i<EmpList.length;i++)
		{
			if(EmpList[i]!=null)
			{
				System.out.print(EmpList[i].getEmpId()+" "+EmpList[i].getEmpName());
				System.out.println();
			}
		}
	}
	public void search(int id)
	{
		for(int i=0;i<EmpList.length;i++)
		{
			if(EmpList[i].getEmpId()==id)
			{
				System.out.print(EmpList[i].getEmpId()+" "+EmpList[i].getEmpName());
				System.out.println();
			}
		}
	}
}
