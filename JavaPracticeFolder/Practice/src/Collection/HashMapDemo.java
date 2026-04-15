package Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapDemo {
public static void main(String[] args) {
	HashMap hm =new HashMap();
	hm.put(101, "a");
	hm.put(292, "b");
	hm.put(353, "c");
	hm.put(714, "d");
	hm.put(965, "e");
	hm.put(676, "f");
	hm.put(007, "g");
	System.out.println(hm);
	
	Set s=hm.entrySet();
	Iterator itr =s.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
}
}
