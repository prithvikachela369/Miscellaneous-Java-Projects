package InheritanceWithSerialization;
import java.io.*;

class A  implements Serializable{
public	int i;
	A(int i){
		this. i = i;
	}
}

class B extends A{
	public int j;
	B(int i, int j) {
		super(i);
		this.j = j;
	}


}

public class InheritSerialize {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		    B b = new B(10000,2345);
			FileOutputStream fo = new FileOutputStream("H:\\JavaIOFiles\\inheritSerialize-1.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(b);
			fo.close();
			os.close();
			System.out.println("Object Serialized :)");
			FileInputStream fi = new FileInputStream("H:\\JavaIOFiles\\inheritSerialize-1.txt");
			ObjectInputStream os2 = new ObjectInputStream(fi);
			b = (B) os2.readObject();
			fi.close();
			os2.close();
		System.out.println("Object Deserialized :)");
		System.out.println(b.i);
		System.out.println(b.j);
		
	}

}
