package com.p1;

public class NoDerived {
	
public NoDerived() {
	Proteced p=new Proteced();
	System.out.println("******* No-Derived's Class *******");
		System.out.println("A:-"+p.a);
		System.out.println("Public A:-"+p.a_pub);
//		System.out.println("Private A:-"+a_pri);
		System.out.println("Protected A:-"+p.a_pro);
	
}
}
