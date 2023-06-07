package java_basics;

import someotherpackage.ExampleClass;

public class LearningMethods {

	public static void main(String[] args) {
		System.out.println("asdsdfsdfsf");
		MyUtils.showMyNameAge("Sanjay Kumar");
		MyUtils.showMyNameAge(39);
		MyUtils.printSomething("Printing String");
//		int sum = MyUtils.sumTwoNumbers(14,64);
//		System.out.println(sum);
		// Use of Object in accessing non static methods.
		MyUtils util = new MyUtils();
		int sum = util.sumTwoNumbers(14,64);
		System.out.println(sum);
		ExampleClass.dosomething();
	}
	
}
