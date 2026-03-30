import java.util.Scanner;

public class StaticVariable {

	static int a;	
	void getA() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A:-");
		a=sc.nextInt();
		}
	void putA() {
		System.out.println("A :-"+a);
	}
	
	public static void main(String[] args) {
		StaticVariable s1= new StaticVariable();
		StaticVariable s2= new StaticVariable();
		StaticVariable s3= new StaticVariable();
		
		s1.getA();
		s2.getA();
		s3.getA();
		
		s1.putA();
		s2.putA();
		s3.putA();
	}
}
