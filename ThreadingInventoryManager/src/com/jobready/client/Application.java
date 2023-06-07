package com.jobready.client;

import com.jobready.inventory.InventoryManager;

public class Application {

	public static void main(String[] args) throws InterruptedException {
		
		InventoryManager manager = new InventoryManager();
		
		Thread inventoryTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.populateSoldProducts();
			}
		});
		
		Thread displayTask = new Thread(new Runnable() {
			
			@Override
			public void run() {
				manager.displaySoldProduct();
			}
		});
		
		inventoryTask.start();
		Thread.sleep(2000); // Alternate is to use inventoryTask.join()
		// But will not solve the issue to be able to handle parallel thread
		//inventoryTask.join();//main thread will wait until this thread completes
		displayTask.start(); // This will return ConcurrentModificationException 
		// cause trying to print data while it is getting modified.
	}

}
