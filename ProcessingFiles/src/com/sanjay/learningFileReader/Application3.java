package com.sanjay.learningFileReader;

class MyClass implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Custom class too can use AutoCloseable Interface, Closing..");
	}
	
}

public class Application3 {

	public static void main(String[] args) {
		try(MyClass class1 = new MyClass();){
			// close method will auto run with try with resource new feature.
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
