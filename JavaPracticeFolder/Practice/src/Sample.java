import java.util.Scanner;

public class Sample {

	public static void main(String[] args) {
		
		System.out.println("Hello world");
//		int a,b,c;
//		a=10;
//		b=20;
//		c=a+b;
//		System.out.println("Sum:-"+c);
		int a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your A:-");
		a=sc.nextInt();
		System.out.print("Enter Your B:-");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Sum:-"+c);
		
	}
}
