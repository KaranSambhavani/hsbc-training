
class Box
{
	private int length,breadth,width;
	private String color="Color is not set";
	private double weight=0.0;
	
	
	public Box(int length,int breadth,int width)
	{
		this.length=length;
		this.breadth=breadth;
		this.width=width;
		
	}
	public Box(int length)
	{
		this(length,length,length);
	}
	public Box(int length,int breadth,int width,String color)
	{
		this(length,breadth,width);
		this.color=color;
		
	}
	public Box(int length,int breadth,int width,String color,double weight)
	{
		this(length,breadth,width,color);
		
		this.weight=weight;
		
	}
	public void getVolume()
	{
		int valume=length*breadth*width;
		System.out.println("Volume of box is "+valume);	
	}
	
	public void getColor()
	{
		System.out.println(color);
	}
	public void getWeight() {
		System.out.println(weight);
	}
}
