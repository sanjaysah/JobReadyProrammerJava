package OOPS;

public class Fish extends Animal{
	
	public Fish(int age, String gender, int weinghtinlbs) {
		super(age, gender, weinghtinlbs);
		// TODO Auto-generated constructor stub
	}

	public void swim() {
		System.out.println("Swimming....");
	}

	
	public void move() {
		System.out.println("Fish is Swimming....");
	}
}
