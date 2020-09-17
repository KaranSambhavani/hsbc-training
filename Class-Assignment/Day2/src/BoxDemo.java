
public class BoxDemo {

	public static void main(String[] args) {
		
		Box ob=new Box(10,20,30);
		ob.getVolume();
		ob.getColor();

		Box ob1=new Box(10,20,30,"Blue");
		ob1.getVolume();
		ob1.getColor();
		
		Box ob2=new Box(10,20,30,"Blue",200);
		ob2.getVolume();
		ob2.getColor();
		ob2.getWeight();
		
		
		

	}

}
