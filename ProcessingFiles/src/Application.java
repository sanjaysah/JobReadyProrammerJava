import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		System.out.println("Enter some text: ");
//		String enteredText = input.nextLine();
//		System.out.println(enteredText);
		try {
			File file = new File("myfile.txt");
			Scanner input;
			input = new Scanner(file);
			while(input.hasNextLine()) {
				String readLineString = input.nextLine();
				System.out.println(readLineString);
			}
			input.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			MyFileUtils utils = new MyFileUtils();
			System.out.println(utils.minus10(19));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
