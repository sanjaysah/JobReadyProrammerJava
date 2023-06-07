package DistributorProject;

public class Customer {
	
	private String name;
	private int cashinhand;
	private String address;
	private int cibilscore;
	
	
	
	public int getCibilscore() {
		return cibilscore;
	}



	public void setCibilscore(int cibilscore) {
		this.cibilscore = cibilscore;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getcashinhand() {
		return cashinhand;
	}



	public void setcashinhand(int cashinhand) {
		this.cashinhand = cashinhand;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
		
		emp.handleCustomer(this,vehicle, emp, finance);
		
	}
	


}
