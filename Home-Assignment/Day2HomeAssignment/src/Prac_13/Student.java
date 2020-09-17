package Prac_13;

public class Student {
 
	private int m[];
	private int n;
     
    MyCalculator ob=new MyCalculator();
    
    
     public Student(int m[]) {
		
		this.m=m;
		this.n=m.length;
	}


	public void total()
     {
    	 System.out.println(ob.add(m[0],m[1],m[2]));
     }
	public void avg()
	{
		System.out.println(ob.add(m[0],m[1],m[2])/3);
		
	}
	
	public void result()
	{
		System.out.println(ob.add(m[0],m[1],m[2])*100/300);
		
	}
	
   
  
  
	
}
