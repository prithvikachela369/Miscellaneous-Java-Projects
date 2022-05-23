package Serializing;

import java.io.*;

public class deserializing {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	Profile p = null;
	
	try {
		FileInputStream fi = new FileInputStream("H:\\JavaIOFiles\\serialize.txt");
		ObjectInputStream i = new ObjectInputStream(fi);
		p = (Profile) i.readObject();
		fi.close();
		i.close();
	}finally {
		System.out.println("Deserializing....");
		System.out.println("Name:'"+p.name+ "'");
		System.out.println("Bussines: "+p.Bussiness);
	}
	}

}
