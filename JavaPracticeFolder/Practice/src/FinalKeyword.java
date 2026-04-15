
 class F1 {  // final keyword likh te hai extend me error aata hai 
	 final int a;
	 public F1() {
		 a=10;
	 }
	 void show() { // final keyword se dusra aesa nahi banega
//		 System.out.println("Show F1");
	}
}
class F2 extends F1 {
	void show() {
		super.show();
		System.out.println("Show F2");
	}
}

public class FinalKeyword {
 public static void main(String[] args) {
	F2 f=new F2();
	f.show();
	
}
} 
