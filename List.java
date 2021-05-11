package cutter;

public class List {
	private String listname;
	
	private My_Product [] productsli;

	public String getListname() {
		return listname;
	}

	public void setListname(String listname) {
		this.listname = listname;
	}

	public My_Product [] getProductsli() {
		return productsli;
	}

	public void setProductsli(Product [] productsli) {
		this.productsli = productsli;
	}
	
	public void include() {
		
		for(int i=0;i<productsli.length;i++) {
			
			
			System.out.println(productsli[i].getProduct());
		}
	}

}
