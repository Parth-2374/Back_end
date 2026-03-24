import java.util.Scanner;

public class MaxNumber3Value {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a,b,c;
	System.out.print("Enter Your A:-");
	a=sc.nextInt();
	System.out.print("Enter Your B:-");
	b=sc.nextInt();
	System.out.print("Enter Your C:-");
	c=sc.nextInt();
	if(a>b) {
		if(a>c) {
			System.out.println("A is Max");
		}else {
			System.out.println("C is Max");
		}
		
	}else if(b>c) {
		System.out.println("B is Max");
	}else {
		System.out.println("C is Max");
	}
}
}
