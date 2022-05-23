package Serializing;

import java.io.*;

public class SerializationClass {

	public static void main(String[] args) {
		Profile p = new Profile();
		p.Bussiness = "Tech";
		p.name = "Hello world";
		
		try {
			FileOutputStream fileout = new FileOutputStream("H:\\JavaIOFiles\\serialize.txt");
			ObjectOutputStream objst = new ObjectOutputStream(fileout);
			objst.writeObject(p);
			fileout.close();
			objst.close();
			System.out.println("Serialized Data Stored in the given File :)");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
