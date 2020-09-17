package loan;

public class MainLoan {

	public static void main(String[] args) {
		
		Person p=new Person("Karan",21,"HomeLoan");
		
		String interest=p.getInterest();
		if(interest.equalsIgnoreCase("Homeloan"))
		{
			HomeLoan ob=new HomeLoan(10, 200000, 12,p);
			ob.getinfo();
			
		}
		else
		{
			PersonalLoan ob1=new PersonalLoan(9, 50000,12,p);
		  ob1.getinfo();	
		}

	}

}
