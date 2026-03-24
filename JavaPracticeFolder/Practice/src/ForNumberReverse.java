
public class ForNumberReverse {
	public static void main(String[] args) {
		int i,j,k;
		for(i=9;i>=1;i--) {
			for(k=1;k<=9-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) {
				System.out.print(" "+i);
			}
			System.out.println();
		}
	}
}
