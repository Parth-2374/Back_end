package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList al =new ArrayList();
	al.add(10);
	al.add(10.10);
	al.add("tops");
	al.add("r");
	al.add(null);
	al.add(true);
	al.add(20);
	System.out.println(al);
	System.out.println(al.get(3));
	System.out.println(al.getFirst());
	System.out.println(al.getLast());
	System.out.println(al.isEmpty());
	System.out.println(al.indexOf(10));
	System.out.println(al.lastIndexOf(10));
	System.out.println("----ArryList Data Iterator----");
	Iterator itr =al.iterator();{
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	ListIterator litr=al.listIterator();
	while(litr.hasNext()) {
		litr.set(litr.next()+" Tops");
	}
	System.out.println("----ArryList Data List Iterator Forward Direction----");
	litr=al.listIterator();
	while(litr.hasNext()) {
		System.out.println(litr.next());
	}
	System.out.println("----ArryList Data List Iterator Reverse Direction----");
	
	while(litr.hasPrevious()) {
		System.out.println(litr.previous());
	}
	
}
}
