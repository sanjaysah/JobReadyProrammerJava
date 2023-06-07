package OOPS;

public class Zoo {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Animal chik1 = new Sparrow(1,"female",2);
//		// This method fly will only be available when object is created from Sparrow class
//		//chik1.fly(); 
//		chik1.move();// This method is coming from abstract method implemented.
//		
//		Animal f1 = new Fish(2, "male", 2);
//		f1.move();
//		
//		moveAnimal(chik1);
//		moveAnimal(f1);
		
		Flyable f1 = new Sparrow(1,"female",2);
		f1.fly();
		//f1.move; // Error cause flyable interface have only one fly method

	}
	
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
