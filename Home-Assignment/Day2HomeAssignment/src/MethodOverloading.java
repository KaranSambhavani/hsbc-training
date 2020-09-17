
public class MethodOverloading {

	 public int add(int a,int b)
	 {
		 System.out.println("int a +int b = "+(a+b));
		 return a+b;
     }
	 public float add(int a,float b)
	 {
		 System.out.println("int a +float b = "+(a+b));
		 return a+b;
     }
	 public double add(int a,double b)
	 {
		 System.out.println("int a +double b = "+(a+b));
		 return a+b;
     }
	 public double add(double a,double b)
	 {
		 System.out.println("double a +double b = "+(a+b));
		 return a+b;
     }
	 
	 public static void main(String[] args) {
		
		 MethodOverloading ob=new MethodOverloading();
		 ob.add(2, 3);
		 ob.add(2, 3.f);
		 ob.add(2, 3.0);
		 
	}
	
}
