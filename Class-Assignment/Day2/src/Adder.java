
public class Adder {

	public static void main(String[] args) {
	   int sum=0;
	   int n=args.length;
	   if(n<2)
		  {
			  System.out.println("Please provide two arguments");
		  }
	   else
	   {
	     for(int i=0;i<n;i++)
	     {
	    	  sum=sum+Integer.parseInt(args[i]);
	     }
			
			  System.out.println(sum);
		  
	   }
	   
	}
}
