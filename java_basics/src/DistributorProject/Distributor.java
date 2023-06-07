package DistributorProject;

public class Distributor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer sanjay = new Customer();
		sanjay.setAddress("Apex The Kremlin, GZB, UP");
		sanjay.setName("Sanjay Kumar");
		sanjay.setcashinhand(900000);
		sanjay.setCibilscore(649);
		Vehicle vehicle = new Vehicle("Renault Triber RXZ", 900000, 5000);

		Employee emp1 = new Employee("Aftab", "Renault001");
		
		sanjay.purchaseCar(vehicle, emp1, true);
		
		Vehicle car = new Vehicle("Renault Triber RXZ", 900000, 5000);
		
		System.out.println(car.equals(vehicle));

	}
	


}
