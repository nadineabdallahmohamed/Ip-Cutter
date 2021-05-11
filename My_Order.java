package cutter;

public class My_Order {
	private  New_Order he;
	private Line  l;
	public My_Order(New_Order h,Line l) {
		
		he=h;
		this.l=l;
	}

	private User oredredby;

	public User getOredredby() {
		return oredredby;
	}

	public void setOredredby(user oredredby) {
		this.oredredby = oredredby;
	}
	
	
	public void Contains() {
		
		
		System.out.println(l.getNoUints());
	}
	
	
	public void Definedby()
	{
		
		
		System.out.println(he.getOrderDate());
	}
}
