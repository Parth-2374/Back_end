import java.util.Scanner;

public class ThrowDemo {
		public static void Demo() {
			int x;
			Scanner sc=new Scanner(System.in);
			try {
			System.out.println("Enter Your x:-");
			x=sc.nextInt();
			if(x>0) {
				System.out.println("Square Of "+x+" Is :-"+(x*x));
			}
			
			else {
				throw new ArithmeticException();
			}
			}catch(ArithmeticException e) {
				System.out.println("Please Enter Positive Values Only.");
				Demo();
			}
		}
		public static void main(String[] args) {
			Demo();
		}
}
