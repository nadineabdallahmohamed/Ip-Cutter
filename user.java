package cutter;

public class Customer {
	
	private String name;
    private  String address;
    
    public Customer(String n) {
    	
    	name=n;
    }
    
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	

}
