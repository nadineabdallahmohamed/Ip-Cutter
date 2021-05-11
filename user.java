package cutter;

public class user {
	
	private String name;
    private  String address;
    
    public user(String n) {
    	
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
