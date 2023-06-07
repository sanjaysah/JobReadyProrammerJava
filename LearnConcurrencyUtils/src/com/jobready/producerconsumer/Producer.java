package com.jobready.producerconsumer;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
	
	BlockingQueue<Integer> queue;
	int questionNo;
	
	public Producer(BlockingQueue<Integer> queue) {
		this.queue = queue;
	}

	@Override
	public void run() {
		while(true) {
			try {
				synchronized (this) {
					int nextNo = questionNo++;
					System.out.println("Ask Question : "+nextNo);
					queue.put(nextNo);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
