package com.jobready.producerconsumer;

import java.util.List;

public class Producer implements Runnable{
	
	List<Integer> questionList = null;
	final int LIMIT = 5;
	private int questionNo;
	
	public Producer(List<Integer> questionList) {
		this.questionList = questionList;
	}
	
	public void askQuestions(int questionNo) throws InterruptedException {
		synchronized(questionList) {
			while(questionList.size()==LIMIT) {
				System.out.println("Question limit is reached, wait for answers.");
				questionList.wait();
			}
		}
		synchronized (questionList) {
			System.out.println("New Question Added: "+questionNo);
			questionList.add(questionNo);
			Thread.sleep(100);
			questionList.notify();
		}
	}

	@Override
	public void run() {
		while(true) {
			try {
				askQuestions(questionNo++);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
