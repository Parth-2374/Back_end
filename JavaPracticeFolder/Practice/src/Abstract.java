
abstract class RBI{
	void show() {
		System.out.println("Hello RBI");
	}
	abstract void roi(double r);
	
}
class SBI extends RBI{
	void roi(double r){
		System.out.println("Rate Of Interest Given By SBI Is:-"+r);
	}
}
class HDFC extends RBI{
	void roi(double r){
		System.out.println("Rate Of Interest Given By HDFC Is:-"+r);
	}
}
public class Abstract {
public static void main(String[] args) {
	SBI s=new SBI();
	s.roi(9.7);
	s.show();
	
	HDFC h=new HDFC();
	h.roi(7.3);
	
}
}
