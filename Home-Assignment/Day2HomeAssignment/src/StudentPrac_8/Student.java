package StudentPrac_8;

public class Student {
	private int id;
	private String name;
  /* public Student()
   {
	   this.id=0;
	   this.name=" ";
   }*/
   public Student(int id) {
		
		this.id = id;
		this.name="Karan";
	}
	   
   public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}

   public void display()
   {
	   System.out.println(id+" "+name);
   }
	
	
}
