package com.bptn.course._SelfLed.Week3.Thursday;

public class MyThread extends Thread {

	@Override
	public void run() {
		System.out.println("This code is running in a thread");
	}

	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.start();
		System.out.println("This code is outside of the thread");
	}

}
