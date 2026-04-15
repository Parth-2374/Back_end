package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorDemo implements Comparator<Emp>{

	
	public int compare(Emp o1, Emp o2) {
		int value=0;
		if(o1.getSalary()>o2.getSalary()) {
			value=-1;
		}else if(o1.getSalary()<o2.getSalary()) {
			value=1;
		}else if(o1.getSalary()==o2.getSalary()) {
			value=0;
		}
		return value;
	}
	public static void main(String[] args) {
		ArrayList<Emp> list =new  ArrayList<>();
		Emp o1=new Emp();
		o1.setEid(1);
		o1.setEname("Parth");
		o1.setSalary(20000);
		
		Emp o2=new Emp();
		o2.setEid(2);
		o2.setEname("Jenil");
		o2.setSalary(25000);
		
		list.add(o1);
		list.add(o2);
		Collections.sort(list, new ComparatorDemo());
		for(Emp o:list) {
			System.out.println("EID : "+o.getEid()+" NAME :"+o.getEname()+" SALARY :"+o.getSalary());
		}
	}

}
