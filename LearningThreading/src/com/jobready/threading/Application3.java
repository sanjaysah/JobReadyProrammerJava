package com.jobready.threading;

public class Application3 {

	public static void main(String[] args) {

		Sequence sequence = new Sequence();
		
		Worker worker1 = new Worker(sequence);
		worker1.start();
		
		Worker worker2 = new Worker(sequence);
		worker2.start();
	}

}

class Worker extends Thread{
	
	Sequence seq = null;
	public Worker(Sequence seq) {
		this.seq = seq;
	}
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+" got value: "+seq.getNext());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
