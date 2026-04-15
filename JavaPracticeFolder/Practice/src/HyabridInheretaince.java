class i{
	void showI() {
		System.out.println("Show I");
	}
}
interface E{
	void show();
}
interface F extends E{
	void show();
}
class G extends i implements E,F{
	public void show() {
		System.out.println("This is show from E and F");
	}
	void showE() {
		System.out.println("Interface E");
	}
	void showF() {
		System.out.println("Interface F");
	}
}
class H extends G{
	void showH() {
		System.out.println("Show H");
	}
}
public class HyabridInheretaince {
public static void main(String[] args) {
	H h1 =new H();
	h1.show();
	h1.showE();
	h1.showF();
	h1.showH();
	h1.showI();
}
}
