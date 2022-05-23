package InheritanceWithSerialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A2  {
public	int i;
A2(){
	i = 90;
	System.out.println("Super Class Constructor Called!!");
}
	A2(int i){
		this. i = i;
	}
	
}

class B2 extends A2 implements Serializable{
	public int j;
	B2(int i, int j) {
		super(i);
		this.j = j;
	}


}
public class InheritSerialize2 {

	public static void main(String[] args)  throws ClassNotFoundException, IOException {
		B2 b = new B2(10, 1110);
		System.out.println(b.i);
		System.out.println(b.j);
		FileOutputStream fo2 = new FileOutputStream("H:\\JavaIOFiles\\inheritSerialize-2.txt");
		ObjectOutputStream os2 = new ObjectOutputStream(fo2);
		os2.writeObject(b);
		fo2.close();
		os2.close();
		System.out.println("Object Serialized :)");//Due to instance control flow it will call super class constructor
		FileInputStream fi2 = new FileInputStream("H:\\JavaIOFiles\\inheritSerialize-2.txt");
		ObjectInputStream os3 = new ObjectInputStream(fi2);
		b = (B2) os3.readObject();
		fi2.close();
		os2.close();
	System.out.println("Object Deserialized :)");
	System.out.println(b.i);
	System.out.println(b.j);
	
	}

}
