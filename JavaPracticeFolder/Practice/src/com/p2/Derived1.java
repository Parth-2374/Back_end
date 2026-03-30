package com.p2;

import com.p1.Proteced;

public class Derived1 extends Proteced {

	public Derived1() {
		System.out.println("******* Derived1 Class ******* ");
//		System.out.println("A:-"+a);
		System.out.println("Public A:-"+a_pub);
//		System.out.println("Private A:-"+a_pri);
		System.out.println("Protected A:-"+a_pro);
		
	}
}
