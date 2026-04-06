import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
		public static void Demo() throws ArithmeticException,InputMismatchException
		{
			int x;
			Scanner sc=new Scanner(System.in);
			
			System.out.println("Enter Your x:-");
			x=sc.nextInt();
			if(x>0) {
				System.out.println("Square Of "+x+" Is :-"+(x*x));
			}
			
			else {
				throw new ArithmeticException();
			}
			
		}
		public static void main(String[] args) {
			try {
				Demo();
			}catch(ArithmeticException e) {
				System.out.println("Plese Enter A Positive Values Only");
				}finally {
				System.out.println("Finally Called");
			}
		}
}
