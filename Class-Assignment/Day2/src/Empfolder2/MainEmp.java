package Empfolder2;



public class MainEmp {

	public static void main(String[] args) {
	
		Emp ob1=new Emp(1,"Karan");
		Emp ob2=new Emp(2,"Karan2");
		
		EmpDb ob=new EmpDb();
		
		ob.addEmp(ob1);
		ob.addEmp(ob2);
		
		ob.display();
		ob.search(2);
		
		
	}
}
