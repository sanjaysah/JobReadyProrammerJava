package OOPS;

//implement interface wherever applicable 
//e.g. here bird who can fly can implement this interface.
public class Sparrow extends Bird implements Flyable{

	public Sparrow(int age, String gender, int weinghtinlbs) {
		super(age, gender, weinghtinlbs);
		// TODO Auto-generated constructor stub
	}

	public void fly() {
		System.out.println("Sparrow Flying High....");
	}

}
