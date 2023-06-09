package com.jobready.threading;

public class Application {
	
	public static void main(String[] args) { // main thread
		
		System.out.println("Starting Thread 1");
		Task taskRunner = new Task("Thread-A"); // thread 2
		taskRunner.start();
		
		System.out.println("Starting Thread 2");
		Task taskRunner2 = new Task("Thread-B");
		taskRunner2.start(); // thread 3, two separate thread running in parallel
		
	}
}

class Task extends Thread{
	String name;
	
	public Task(String name) {
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
