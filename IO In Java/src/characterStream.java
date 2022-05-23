import java.io.*;
public class characterStream {

	public static void main(String[] args) {
		FileWriter f = null;
		
		try {
			f = new FileWriter("H:\\charStreamJava.txt");
			f.write("Hello Character Stream File");
			f.close();
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
/*
 * Character Stream. In Java, characters are stored using Unicode conventions (Refer this for details). 
 * Character stream automatically allows us to read/write data character by character. For example 
 * FileReader and FileWriter are character streams used to read from source and write to destination.
 * */
