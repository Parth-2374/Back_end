import java.util.Scanner;

public class EvenOROdd {
public static void main(String[] args) {
	int a;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter Your A:-");
	a=sc.nextInt();
	if(a%2==0) {
		System.out.println("Even Number");
		
	}else {
		System.out.println("Odd Number");
	}
	
}
}
