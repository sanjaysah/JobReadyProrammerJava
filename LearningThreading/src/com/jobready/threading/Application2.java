package com.jobready.threading;

public class Application2 {
	
	public static void main(String[] args) { // main thread
		
		System.out.println("Starting Task1 Thread 1");
		Task1 taskRunner = new Task1("Thread-A"); // thread 2
		Thread t1 = new Thread(taskRunner);
		t1.start();
		
		System.out.println("Starting Task1 Thread 2");
		Task1 taskRunner2 = new Task1("Thread-B");
		Thread t2 = new Thread(taskRunner2);
		t2.start(); // thread 3, two separate thread running in parallel
		
	}
}

class Task1 implements Runnable{
	String name;
	
	public Task1(String name) {
		this.name=name;
	}
	
	public void run() {
		Thread.currentThread().setName(name);
		for (int i = 0; i < 100; i++) {
			System.out.println("Number : "+i+" - "+Thread.currentThread().getName());
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
