package Collection;

import java.util.HashSet;

public class HashSetDemo {
public static void main(String[] args) {
	HashSet hs =new HashSet();
	hs.add(10);
	hs.add(10.6);
	hs.add("tops");
	hs.add("t");
	hs.add(null);
	hs.add(10);
	hs.add(true);
	hs.add("Java");
	hs.add(100);
	System.out.println(hs);
}
}
