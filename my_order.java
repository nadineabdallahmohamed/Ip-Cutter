package cutter;

public class my_order {
	private  new_order he;
	private line  l;
	public my_order(OrderHeader h,OrderLine l) {
		
		he=h;
		this.l=l;
	}

	private user oredredby;

	public user getOredredby() {
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
