
public class PassByValue {

	int x=20;
	int a[]= {1,2,3,4,5};
	
	public void change()
	{
		x=10;
		int y=x;
		System.out.println(x);
		System.out.println("y="+y);
	}
	
	public static void main(String[] args) {
		
		PassByValue ob=new PassByValue();
		ob.change();
		System.out.println("x= "+ob.x);
		
		int b[]=ob.a;
		ob.a[2]=8;
		for(int i=0;i<ob.a.length;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println(b==ob.a);
		System.out.println(b.equals(ob.a));
		
		
		int c[]= {1,2,8,4,5};
		System.out.println(c==ob.a);
		System.out.println(c.equals(ob.a));
		
		
		

	}

}
