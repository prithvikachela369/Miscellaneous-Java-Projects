package InheritanceWithSerialization;
import java.io.*;

class parent implements Serializable{
	static int y;
	parent(int y){
		this.y = y;
	}
}
class child extends parent{
static int h;
	child(int y, int h) {
		super(y);
		this.h = h;
	}
	private void writeObject(ObjectOutputStream out) throws NotSerializableException {
		throw new NotSerializableException();
	}
	private void readObject(ObjectInputStream in) throws NotSerializableException {
		throw new NotSerializableException();
	}
	
}
public class preventingSerialization {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		child b = new child(20000,2345);
		System.out.println(child.y);
		System.out.println(child.h);
		FileOutputStream fo2 = new FileOutputStream("H:\\JavaIOFiles\\preventingSerialization.txt");
		ObjectOutputStream os2 = new ObjectOutputStream(fo2);
		os2.writeObject(b);
		fo2.close();
		os2.close();
		System.out.println("Object Serialized :)");
		FileInputStream fi2 = new FileInputStream("H:\\JavaIOFiles\\ipreventingSerialization.txt");
		ObjectInputStream os3 = new ObjectInputStream(fi2);
		b = (child) os3.readObject();
		fi2.close();
		os2.close();
	System.out.println("Object Deserialized :)");
	System.out.println(child.y);
	System.out.println(child.y);
	
	}

}
