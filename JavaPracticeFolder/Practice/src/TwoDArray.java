import java.util.Scanner;

public class TwoDArray {
	public static void main(String[] args) {
		int a[][]=new int[3][3];
		int i,j;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter 2D Array");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println("Enter "+i+"Row &"+j+"Column :-");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("2D Array");
		for(i=0;i<a.length;i++) {
			for(j=0;j<a.length;j++) {
				System.out.println(a[i][j]);
				System.out.println("A ["+i+"] ["+j+"]");
			}
		}
	}
}
