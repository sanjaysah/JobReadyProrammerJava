package com.jobready.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
	
	BlockingQueue<Integer> queue;
	
	public Consumer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
				System.out.println("Answer Question");
				queue.take();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
