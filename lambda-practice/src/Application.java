import java.security.PublicKey;

public class Application {

	public static void main(String[] args) {
		
		Human sanjay = new Human();
		walker(sanjay);
		
		Robot walle = new Robot();
		walker(walle);
		
		//Ananymous class
		walker(new Walkable() {
			
			@Override
			public void walk() {
				System.out.println("Custom/Ananymous Object walking");
				
			}
		});
		
		//Lambda Function from functional Programming Java 8 onwards
		walker( () -> {
			System.out.println("Lambda Function from functional Programming Java 8 onwards");
		});
		
		//IMP - Lambda Code must be assigned to FinctionalInterface object.
		Walkable aBlockOfCode = () -> {
			System.out.println("First Line");
			System.out.println("Second Line");
		};
		
		walker(aBlockOfCode);
		
		//Lambda for SayHello method
		AfunctionalInterface sayhello = () -> {
			System.out.println("Hello There");
		};
		sayhello.random(); //no need to use sysout.
		
		//Lambda for Sum of 2 No method
		Calculate sum2int = (arg1,arg2) -> {
			return arg1+arg2;
			};	
		System.out.println(sum2int.compute(12, 1233));;
		
		//Lambda to divide nonzero nums
		Calculate div = (a, b) -> {
			if(b==0)
				System.out.println("Divisor should be non zero");
			return a/b;
		};
		System.out.println(div.compute(9, 2));
		
		//To use Lambda better we can use generic in FunctionalInterface
		GenricFInterface<String> reverse = (str) -> {
			String result="";
			for(int i=str.length()-1;i>=0;i--) {
				result+=str.charAt(i);
			}
			return result;
		};
		System.out.println(reverse.calculate("SAnjay"));
		
		//To use Lambda better we can use generic in FunctionalInterface
		GenricFInterface<Integer> facotrial = (n) -> {
			int result=n;
			for(int i=n-1;i>=1;i--) {
				result*=i;
			}
			return result;
		};
		System.out.println(facotrial.calculate(10));
	}
	
	public static void walker(Walkable walkableEntity) {
		walkableEntity.walk(); 
	}

}
