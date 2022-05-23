import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class SerializationWithStaticMembers implements Serializable{
	 static int o = 100000;
	public static void main(String[] args) throws ClassNotFoundException, IOException{
		SerializationWithStaticMembers s = new SerializationWithStaticMembers();
		System.out.println("Before Serialization Value is "+o);
		
		try {
			
			FileOutputStream fo = new FileOutputStream("H:\\JavaIOFiles\\staticmemberserialize.txt");
			ObjectOutputStream os = new ObjectOutputStream(fo);
			os.writeObject(s);
			fo.close();
			os.close();
			System.out.println("Object Serialized :)");
			
			o = 1234565;
			
			FileInputStream fi = new FileInputStream("H:\\JavaIOFiles\\staticmemberserialize.txt");
			ObjectInputStream os2 = new ObjectInputStream(fi);
			s = (SerializationWithStaticMembers) os2.readObject();
			fi.close();
			os2.close();
		System.out.println("Object Deserialized :)");
		
		System.out.println("After Deserialization Value is "+o);
		}catch(Exception m) {}
	}

}
