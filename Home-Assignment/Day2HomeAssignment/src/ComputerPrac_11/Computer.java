package ComputerPrac_11;


public class Computer {
  
	String cName;
	public Computer(String cName)
	{
		this.cName=cName;
	}

	static class Monitor
	{
		public static String name="abc";
	}
	static class KeyBord
	{
		public static String company="xyz";
	}
	static class Mouse
	{
		public static boolean blutooth=true;
	}
	static class Cpu
	{
		public static String name1="pqr";
	}

	
   public void getInfo()
   {
	   System.out.println("Name of the computer is "+cName);
	   System.out.println(Monitor.name+" "+KeyBord.company+" "+Mouse.blutooth+" "+Cpu.name1);
   }
	

}
