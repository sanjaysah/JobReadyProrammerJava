package lambda.practical;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		List<Car> cars = Arrays.asList(
			new Car("Honda", "Accord", "Red", 22300),
			new Car("Honda", "Civic", "Blue", 17700),
			new Car("Toyota", "Land Cruiser", "White", 48500),
			new Car("Toyota", "Corolla", "Black", 16200),
			new Car("Toyota", "Camry", "Blue", 24000),
			new Car("Nissan", "Sentra", "White", 17300),
			new Car("Mitshubishi", "Lancer", "White", 20000),
			new Car("Jeep", "Wrangler", "White", 24500)
			);
		
		printCarsPriceRange(cars, 18000, 22000);
		printCarsByColor(cars, "Blue");
		
	}
	
	public static void printCarsPriceRange(List<Car> carsList, int low, int high) {
		for(Car c:carsList) {
			if(c.getPrice()>=low && c.getPrice()<=high)
				System.out.println(c.printCar());
		}
	}
	
	public static void printCarsByColor(List<Car> carsList, String color) {
		for(Car c:carsList) {
			if(c.getColor().equals(color))
				System.out.println(c.printCar());
		}
	}
}
