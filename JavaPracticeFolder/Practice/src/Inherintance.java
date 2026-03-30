import java.util.Scanner;

class A{
	int a;
	void getA() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter A:-");
		a=sc.nextInt();
	}
	void putA() {
		System.out.println("A:-"+a);
	}
}
class B extends A{
	int b;
	void getB() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter B:-");
		b=sc.nextInt();
	}
	void putB() {
		System.out.println("B:-"+b);
	}
}
class C extends A{
	int c;
	void getC() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter C:-");
		c=sc.nextInt();
	}
	void putC() {
		System.out.println("C:-"+c);
	}
}
class D extends A{
	int d;
	void getD() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter D:-");
		d=sc.nextInt();
	}
	void putD() {
		System.out.println("D:-"+d);
	}
}
public class Inherintance {
public static void main(String[] args) {
	D d1=new D();
	d1.getA();
	d1.getD();
	d1.putA();
	d1.putD();
	
	B b1=new B();
	b1.getA();
	b1.putA();
}
}
