package DistributorProject;

import java.util.Objects;

public class Vehicle {
	
	private String modelname;
	private double price;
	private int discount;
	
	public Vehicle(String modelname, double price, int discount) {
		super();
		this.modelname = modelname;
		this.price = price;
		this.discount = discount;
	}

	public String getModelname() {
		return modelname;
	}

	public double getPrice() {
		return price;
	}

	public int getDiscount() {
		return discount;
	}

	@Override
	public String toString() {
		return "Vehicle [modelname=" + modelname + ", price=" + price + ", discount=" + discount + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(discount, modelname, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		return discount == other.discount && Objects.equals(modelname, other.modelname)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price);
	}
	
	
	
	
}
