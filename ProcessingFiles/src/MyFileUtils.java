import com.sanjay.exceptions.MyCustomException;

public class MyFileUtils {
	
	public int minus10(int num) throws MyCustomException{
		if(num<10) {
			throw new MyCustomException("Number provided is less than 10");
		}
		return num-10;
	}

}
