
public class CheckingAccount {

	int acno;
	double blance;
	String cname;
	public CheckingAccount(int acno, double blance, String cname) {
		this.acno = acno;
		this.blance = blance;
		this.cname = cname;
		System.out.println("Hello "+cname+", Your Account Number "+acno+" Is Opend With "+blance);
		
	}
	void deposit(double amount) {
		this.blance=this.blance+amount;
	}
	void withdraw(double amount) throws InsufficientFund {
		if(amount<this.blance) {
			this.blance=this.blance-amount;
		}else {
			throw new InsufficientFund(amount);
		}
	}
	void checkblance() {
		System.out.println("Current Blance:-"+this.blance);
	}
	
}
