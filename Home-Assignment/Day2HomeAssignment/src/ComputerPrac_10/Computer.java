package ComputerPrac_10;

public class Computer {
  
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
	   System.out.println(Monitor.name+" "+KeyBord.company+" "+Mouse.blutooth+" "+Cpu.name1);
   }
	
	
	
}
