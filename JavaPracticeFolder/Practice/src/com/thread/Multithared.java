package com.thread;
class Newthread1 implements  Runnable {
	Thread t;
	String tname;
	public Newthread1(String tname) {
		this.tname=tname;
		t=new Thread(this,tname);
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
public class Multithared {
	public static void main(String[] args) {
		new Newthread1("one");
		new Newthread1("Two");
		new Newthread1("Three");
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
