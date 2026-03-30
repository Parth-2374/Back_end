
public class OverLoading {

	void test() {
		System.out.println("test with No Argument");
	}
	void test(int a) {
		System.out.println("test with 1 Argument");
	}
	void test(int a ,int b) {
		System.out.println("test with 2 Argument");
	}
	public static void main(String[] args) {
		OverLoading m =new OverLoading();
		m.test();
	}
}
