package lambda.practical;

import java.util.Arrays;
import java.util.List;

public class Application2 {

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
		
		/*//Anonymous class used here
		 * System.out.println("Printing cars with price between 18000 and 22000");
		 * printCars(cars, new CarCondition() {
		 * 
		 * @Override public boolean test(Car car) { return (car.getPrice()>=18000 &&
		 * car.getPrice()<=22000); } });
		 */
	
		/*//Anonymous class used here
		 * System.out.println("Printing cars with color blue"); 
		 * printCars(cars, new
		 * CarCondition() {
		 * 
		 * @Override public boolean test(Car car) { return
		 * car.getColor().equals("Blue"); } });
		 */
			
		//Usage of Lambda Function
		System.out.println("Printing cars with price between 18000 and 22000");
		printCars(cars, (car) -> car.getPrice()>=18000 && car.getPrice()<=22000);
		
		//Usage of Lambda Function
		System.out.println("Printing cars with color blue");
		printCars(cars, (car) -> car.getColor().equals("Blue"));
	}
	
	public static void printCars(List<Car> cars, Condition<Car> condition) {
		for(Car c: cars) {
			if(condition.test(c)) {
				System.out.println(c.printCar());
			}
		}
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

@FunctionalInterface
interface Condition<T>{
	public boolean test(T t);
}
