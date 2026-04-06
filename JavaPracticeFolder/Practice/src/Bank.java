import java.util.Scanner;

public class Bank {
 public static void main(String[] args) {
	CheckingAccount c= new CheckingAccount(101, 1000, "parth");
	Scanner sc =new Scanner(System.in);
	double amount;
	while(true) {
		System.out.println("********************");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Check Blance");
		System.out.println("4. Exit");
		System.out.println("********************");
		System.out.println("Enter Your Choice");
		int choice=sc.nextInt();
		System.out.println("********************");
		if(choice==1) {
			System.out.println("Enter Deposit Amount:-");
			amount=sc.nextDouble();
			c.deposit(amount);
			
		}else if(choice==2) {
			System.out.println("Enter Withdrawal Amount:-");
			amount=sc.nextDouble();
			try {
				c.withdraw(amount);
			}catch(InsufficientFund i) {
				System.out.println("Sorry, You need Another "+i.getAmount()+"Rs.");
			}
			
		}
		else if(choice==3) {
			c.checkblance();
		}else if(choice==4) {
			System.out.println("Thank You For Using Our Service");
			break;
		}else {
			System.out.println("Invalid Choice. Please Try Again...");
		}
		System.out.println("********************");
	}
}
}
