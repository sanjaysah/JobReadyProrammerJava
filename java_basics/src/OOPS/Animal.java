package OOPS;

public abstract class Animal {
	
	int age;
	String gender;
	int weinghtinlbs;
	

	
	public Animal(int age, String gender, int weinghtinlbs) {
		super();
		this.age = age;
		this.gender = gender;
		this.weinghtinlbs = weinghtinlbs;
	}

	public void eat() {
		System.out.println("Eating....");
	}
	
	public void sleep() {
		System.out.println("Sleeping...");
	}
	
	public abstract void move();
	
	
	
	

}
