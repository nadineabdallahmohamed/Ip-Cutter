package cutter;

public class New_User extends  User {
	public New_User(String name) {
		
		super(name);
	}
	private  float totlepurachse;

	public float getTotlepurachse() {
		return totlepurachse;
	}

	public void setTotlepurachse(float totlepurachse) {
		this.totlepurachse = totlepurachse;
	}
	
	
	public float calculate() {
		
		return totlepurachse*250;
	}
	
	
	
	

}
