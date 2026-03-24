

public class ForNumberIncreasingReverse {
	public static void main(String[] args) {
		int i,j,k;
		for(i=10;i>=1;i--) {
			for(k=1;k<=10-i;k++) {
				System.out.print(" ");
			}
			for(j=1;j<i;j++) {
				System.out.print(" "+j);
			}
			System.out.println();
		}
	}
}


