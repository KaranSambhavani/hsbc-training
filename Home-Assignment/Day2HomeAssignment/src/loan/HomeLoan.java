package loan;

public class HomeLoan {
 
	float percentage;
	double loanAmount;
	int month;
	Person p;
	public HomeLoan(float percentage, double loanAmount, int month,Person p) {
		super();
		this.percentage = percentage;
		this.loanAmount = loanAmount;
		this.month = month;
		this.p=p;
	}
	public void getinfo()
	{
		
			System.out.println(p.getName()+" "+p.getAge()+" "+percentage+" "+loanAmount+" "+month);
			
		
	}
}
