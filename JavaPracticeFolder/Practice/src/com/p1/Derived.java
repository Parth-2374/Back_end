package com.p1;

public class Derived extends Proteced {
  
	public Derived() {
		System.out.println("******* Derived's Class *******");
		System.out.println("A:-"+a);
		System.out.println("Public A:-"+a_pub);
//		System.out.println("Private A:-"+a_pri);
		System.out.println("Protected A:-"+a_pro);
	}
}
