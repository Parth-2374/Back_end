import java.util.Scanner;

public class LadderIf {
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int rno,s1,s2,s3,s4,s5,total;
	double per;
	String sname;
	System.out.println("Enter your Name:-");
	sname=sc.next();
	System.out.println("Enter Your RollNo:-");
	rno=sc.nextInt();
	System.out.println("Enter Your S1:-");
	s1=sc.nextInt();
	System.out.println("Enter Your S2:-");
	s2=sc.nextInt();
	System.out.println("Enter Your S3:-");
	s3=sc.nextInt();
	System.out.println("Enter Your S4:-");
	s4=sc.nextInt();
	System.out.println("Enter Your S5:-");
	s5=sc.nextInt();
	
	total=s1+s2+s3+s4+s5;
	per=total/5;
	System.out.println("Student Name:-"+sname);
	System.out.println("Student Roll No:-"+rno);
	System.out.println("Total Marks:-"+total);
	System.out.println("Per:-"+per);
	
	
	if(per>80) {
		System.out.println("Destinction");
	}else if(per>70) {
		System.out.println("First Class");
	}else if(per>60) {
		System.out.println("Secoend Class");
	}else if(per>50) {
		System.out.println("Pass Class");
	}else {
		System.out.println("Fail");
	}
	
	
	
}
}
