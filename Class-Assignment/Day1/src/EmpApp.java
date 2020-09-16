
/**
 * 
 * @author Karan Sambhavanee
 *
 */

public class EmpApp {

	public static void main(String[] args) {
		Emp ob=new Emp(100,"Karan","Ahmeadabad",60000);
		
		String info=ob.getEmpDetals();
		System.out.println(info);
		
		ob.setEmpName("Karan Sambhavanee");
		ob.setSalary(70000);
		System.out.println(ob.getEmpDetals());
	}
}
