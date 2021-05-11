package cutter;

public class Try_Cutter {
	
	private int  age;
	private float salary;
	public Try_Cutter (int age,float salary) {
		this.age=age;
		this.setSalary(salary);
		
		
	}
	
	public int getage() {
		
		return age;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	

}
