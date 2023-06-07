package java_basics;

public class StringExamples {

	public static void main(String[] args) {
		
		String str = "Hello there Abby there!";
		String a = "Hello";
		String b = "there";
		System.out.println(str.indexOf('A'));
		System.out.println(str.indexOf("there"));
		System.out.println(str.indexOf("there", 7));
		System.out.println(str.lastIndexOf("there"));
		System.out.println(str.charAt(2));
		System.out.println(str.substring(12));
		System.out.println(str.substring(2,12));
		System.out.println(str.contains("there"));
		System.out.println(a.equals("hello"));
		System.out.println(a.equalsIgnoreCase("hellO"));
		
		
	}

}
