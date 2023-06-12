package lambda.practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

// Use of existing Functional Interfaces provided by Java e.g. Predicate
public class Application3 {

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
		
		//Usage of Lambda Function
		System.out.println("Printing cars with price between 18000 and 22000");
		printCars(cars, (car) -> car.getPrice()>=18000 && car.getPrice()<=22000);
		
		//Usage of Lambda Function
		System.out.println("Printing cars with color blue");
		printCars(cars, (car) -> car.getColor().equals("Blue"));
	}
	
	public static void printCars(List<Car> cars, Predicate<Car> predicate) {
		for(Car c: cars) {
			if(predicate.test(c)) {
				System.out.println(c.printCar());
			}
		}
	}
	
}
