package java_basics;

public class ControlFlow {

	public static void main(String[] args) {
		int month=4;
		String monthName;
		
		switch(month) {
		case 1: monthName = "January";
			break;
		case 2: monthName = "February";
			break;
		case 3: monthName = "March";
			break;
		case 4: monthName = "April";
			break;
		default: monthName = "May";
			break;
		}
			
		System.out.println(monthName);	
	}

}
