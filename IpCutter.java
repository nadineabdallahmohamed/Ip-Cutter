package cutter;

public class IpCutter extends user {
	public IpCutter(String name) {
		
		super(name);
	}
	
	private int totalorders ;

	public int getTotalorders() {
		return totalorders;
	}

	public void setTotalorders(int totalorders) {
		this.totalorders = totalorders;
	}
	
	
public int calculate_total_orders() {
		
		return totalorders*100;
	}

	
	
}
