package com.thread;

class Newthread implements  Runnable {
	Thread t;
	public Newthread() {
		t=new Thread(this,"child Thread");
		t.start();
	}
	public void run() {
		try {
			for(int i=0;i<5;i++) {
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Child Thread Exiting");
	}
}

public class ThreadDemo {
	public static void main(String[] args) {
		new Newthread();
		Thread t=Thread.currentThread();
		System.out.println(t);
		t.setName("My Thread ");
		System.out.println("After Change name Thread"+t);
		t.setPriority(3);
		System.out.println("Afer Change Priority"+t);
		try {
			for(int i=0;i<5;i++) {
				System.out.println(t+" : "+i);
				Thread.sleep(1000);
			}
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.out.println("Main Thread Exiting");
		}
	}

