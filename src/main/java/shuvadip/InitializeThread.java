package com.shuvadip;


public class InitializeThread {

	public static void main(String... a) {
		SampleThread t1 = new SampleThread();
		Thread t2 = new Thread(new SampleThread1());
		Thread t3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println("Thrad is starting-- extending thread class");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		t2.start();
		t3.start();
	}
}


class SampleThread extends Thread{
	
	public void run() {
		System.out.println("Thrad is starting-- extending thread class");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}


class SampleThread1 implements Runnable{
	
	public void run() {
		System.out.println("Thrad is starting-- implementing Runnable Interface");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}