
class StDemo {

	static
	{
		System.out.println("Hi this is static block");
	}
	static int count=0;
	public StDemo() {
		
		count++;
	}
	
}

public class StaticDemo
{
	public static void main(String[] args) {
		StDemo ob1=new StDemo();
		StDemo ob2=new StDemo();
		StDemo ob3=new StDemo();
		StDemo ob4=new StDemo();
		System.out.println(StDemo.count);
		
	}
}