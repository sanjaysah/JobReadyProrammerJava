package CollectionWithGenerics;

public class Vehicle {
	String make;
	String model;
	double price;
	boolean available;
	
	public Vehicle(String make, String model, double price, boolean available) {
		super();
		this.make = make;
		this.model = model;
		this.price = price;
		this.available = available;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", price=" + price + ", available=" + available + "]";
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	

}
