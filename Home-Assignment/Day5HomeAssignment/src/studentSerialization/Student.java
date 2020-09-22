package studentSerialization;

import java.io.Serializable;

public class Student implements Serializable {

	private int sid;
	private String name;
	private String std;
	
	public Student(int sid, String name, String std) {
		super();
		this.sid = sid;
		this.name = name;
		this.std = std;
	}

	@Override
	public String toString() {
		return sid+" "+name+" "+std;
	}
	
	
	
}
