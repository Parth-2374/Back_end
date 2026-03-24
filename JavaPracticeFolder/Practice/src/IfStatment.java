import java.util.Scanner;

public class IfStatment {
 public static void main(String[] args) {
	int a;
	Scanner sc =new Scanner(System.in);
	System.out.print("Enter Your A:-");
	a=sc.nextInt();
	
	if (a>0) {
		System.out.println("Positive Number");
	}else {
		System.out.println("Negitive Number");
	}
}
}
