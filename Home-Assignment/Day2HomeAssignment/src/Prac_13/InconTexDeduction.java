package Prac_13;

public class InconTexDeduction {

	public double texAmount(Employee e)
	{
		int s[]=e.getS();
		int sum=0;
		for(int i=0;i<s.length;i++)
		{
			sum=sum+s[i];
		}
		
		double netTex=sum*9/100;
		return netTex;
	}
	
	
}
