package com.p2;

import com.p1.Proteced;

public class NonDerived {

	public NonDerived() {
		Proteced p= new Proteced();
		System.out.println("******* NonDerived Class ******* ");
//		System.out.println("A:-"+p.a);
		System.out.println("Public A:-"+p.a_pub);
//		System.out.println("Private A:-"+p.a_pri);
//		System.out.println("Protected A:-"+p.a_pro);
				
	}
}
