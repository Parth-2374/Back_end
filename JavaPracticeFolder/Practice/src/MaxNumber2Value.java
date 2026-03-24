import java.util.Scanner;

public class MaxNumber2Value {
 public static void main(String[] args) {
	 Scanner sc =new Scanner(System.in);
	 int a,b;
	 System.out.print("Enter Your A:-");
	 a=sc.nextInt();
	 System.out.print("Enter Your B:-");
	 b=sc.nextInt();
	 
	 if(a>b) {
		 
		 System.out.println("A is MAX");
	 }
	 else {
		 System.out.println("B is MAX");
	 }
 }
}
