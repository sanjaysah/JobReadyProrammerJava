package DistributorProject;

public class Employee {
	
	private String name;
	private String id;
	
	public Employee(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public void handleCustomer(Customer cust, Vehicle vehicle, Employee emp, boolean finance) {
		
		if(vehicle.getPrice() <= cust.getcashinhand()) {
			processFullTransaction(cust, vehicle);
		}
		else if(finance==true) {
			
			double downpayment;
			double approvedAmount = runCreditHistoryGetApprovedAmount(cust, vehicle.getPrice());
			
			if(approvedAmount==0)
				System.out.println("Ask Customer to pay in full as finance is denied.");
			else {
				downpayment = vehicle.getPrice()-approvedAmount;
				System.out.println("Ask customer to make DownPayment of - "+downpayment+" and submit finance documents attested/signed");
			}
		}
		else {
			System.out.println("Ask Customer to bring more money, "+(vehicle.getPrice()-cust.getcashinhand())+" to be exact, considering customer has already bought cash in hand "+cust.getcashinhand());
		}
	}
	
	private void processFullTransaction(Customer cust, Vehicle vehicle) {
		
		System.out.println("For Customer: "+cust.getName()+" - Begin full payment and process of taking all necessary documents and in last deliver the Vehicle. \n"+vehicle);
	
	}

	private double runCreditHistoryGetApprovedAmount(Customer cust, double doubleAmount) {
		
		int cscore = cust.getCibilscore();
		
		if(cscore>=800)
			return doubleAmount*0.9;
		else if(cscore<800 && cscore>=700)
			return doubleAmount*0.7;
		else if(cscore<700 && cscore>=650)
			return doubleAmount*0.5;
		else
			return 0;
			
		
	}
}
