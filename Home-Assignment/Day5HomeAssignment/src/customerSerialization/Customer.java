package customerSerialization;

import java.io.Serializable;

public class Customer implements Serializable{

	private int customerId;
	private String name;
	private String address;
	public Customer(int customerId, String name, String address) {
		super();
		this.customerId = customerId;
		this.name = name;
		this.address = address;
	}
	
	@Override
	public String toString() {
		
		return customerId+" "+name+" "+address;
	}
	
}
