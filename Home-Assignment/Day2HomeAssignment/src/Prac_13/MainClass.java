package Prac_13;

public class MainClass {

	public static void main(String[] args) {
		int m[]= {70,90,80};
		Student s=new Student(m);
		
		s.total();
		s.avg();
		s.result();
		
		int salaries[]= {50000,60000,30000};
		Employee ob=new Employee(salaries);
		ob.totalSalary();
		
		InconTexDeduction ob1=new InconTexDeduction();
		System.out.println(ob1.texAmount(ob));
		
	}
	
}
