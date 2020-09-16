
/**
 * 
 * @author Karan Sambhavanee
 *
 */
public class Emp {

	private int empId;
	private String empName;
	private String city;
	private double salary;
	
	/**
	 * This method generate an info based on the given parameters
	 * @param empId
	 * @param empName
	 * @param city
	 * @param salary
	 */
	public Emp(int empId,String empName,String city,double salary)
	{
	 this.empId=empId;
	 this.empName=empName;
	 this.city=city;
	 this.salary=salary;
	}
	
	
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}



	public String getEmpDetals()
	{
		return empId+" "+empName+" "+city+" "+salary;
	}
}
