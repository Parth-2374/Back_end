package com.p1;

public class Proteced {

	int a=10;
	public int a_pub=20;
	private int a_pri=40;
	protected int a_pro=50;
	
	public Proteced() {
		System.out.println("*******Protected's Class ******* ");
		System.out.println("A:-"+a);
		System.out.println("Public A:-"+a_pub);
		System.out.println("Private A:-"+a_pri);
		System.out.println("Protected A:-"+a_pro);
		
	}
}
