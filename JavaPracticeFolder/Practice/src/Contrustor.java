class Box{
	double width,height,depth;
	Box(){
	System.out.println("Default Constructor Called");
	width=5;
	height=5;
	depth=6;
	}
Box(double w,double h,double d){
	System.out.println("Parameter Constructor Called");
	width=w;
	height=h;
	depth=d;
}

Box(Box b){
	System.out.println("Copy Constructor Called");
	width=b.width;
	height=b.height;
	depth=b.depth;
}


void Volume(){
	System.out.println("Volume :-"+(width*height*depth));
}
}
public class Contrustor {
public static void main(String[] args) {
	Box b1=new Box();
	b1.Volume();
	
	Box b2=new Box(6,9,2);
	b2.Volume();
	
	Box b3=new Box(b1);
	b3.Volume();
}
}
