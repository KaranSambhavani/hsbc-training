package loan;

public class PersonalLoan {

	float percentage;
	double loanAmount;
	int month;
	Person p;
	public PersonalLoan(float percentage, double loanAmount, int month,Person p) {
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
