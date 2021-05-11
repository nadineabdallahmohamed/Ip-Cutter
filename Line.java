package cutter;

public class Line {
	
	private My_Product item;
	private int noUints ;

	public My_Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public int getNoUints() {
		return noUints;
	}

	public void setNoUints(int noUints) {
		this.noUints = noUints;
	}
	
	
	public void oredr() {
		
		System.out.println(item.getProduct());
	}
	
	

}
