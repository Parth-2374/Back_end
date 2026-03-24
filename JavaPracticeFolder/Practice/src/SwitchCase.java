import java.util.Scanner;

public class SwitchCase {
public static void main(String[] args) {
	int a,b,choise,ans;
	boolean flag=true;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your A:-");
	a=sc.nextInt();
	System.out.println("Enter Your B:-");
	b=sc.nextInt();
	
	while(flag) {
		System.out.println("************");
		System.out.println("1. Sum");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("4. Div");
		System.out.println("5. Exit");
		System.out.println("************");
		System.out.println("Eneter Your Choise:");
		choise=sc.nextInt();
		
		switch(choise) {
		case 1:
			ans=a+b;
			System.out.println("Sum"+ans);
			break;
		case 2:
			ans=a-b;
			System.out.println("Sub"+ans);
			break;
		case 3:
			ans=a*b;
			System.out.println("Mul"+ans);
			break;
		case 4:
			ans=a/b;
			System.out.println("Div"+ans);
			break;
		case 5:
			System.out.println("Thank you For Using Our Service");
			flag=false;
			break;
		default:
			System.out.println("invalid choise");
			break;
		}
	}
}
}
