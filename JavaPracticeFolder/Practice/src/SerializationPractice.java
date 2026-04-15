import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Company implements Serializable{
	int cid;
	String Cname;
	public Company(int cid, String cname) {
		this.cid = cid;
		Cname = cname;
	}
	public String toString() {
		return "Company [cid=" + cid + ", Cname=" + Cname + "]";
	}
	
}
public class SerializationPractice {
public static void main(String[] args) throws IOException, ClassNotFoundException {
	Company c1=new Company(101, "Dave");
	FileOutputStream fos =new FileOutputStream("ser1");
	ObjectOutputStream oos =new ObjectOutputStream(fos);
	oos.writeObject(c1);
	oos.flush();
	oos.close();
	System.out.println("File  Writer Successfully");
	
	FileInputStream fis = new FileInputStream("ser1");
	ObjectInputStream ois =new ObjectInputStream(fis);
	Company c2=(Company) ois.readObject();
	System.out.println(c2);
	ois.close();
}

}
