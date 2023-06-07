package CollectionWOGenerics;
import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		ArrayList array1 = new ArrayList();
		array1.add("Sanjay");
		array1.add(20);
		array1.add(true);
		array1.add(1, 'c');
		
		String nameString = (String)array1.get(0);
		
	}

}
