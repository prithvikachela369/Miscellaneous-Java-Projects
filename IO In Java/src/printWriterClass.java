import java.io.File;
import java.io.*;
import java.io.IOException;

public class printWriterClass {

	public static void main(String[] args) throws IOException {
	File f = new File("H:\\JavaIOFiles\\printwriter.txt");
	
	if(!f.exists()) {
		f.createNewFile();
	}
	try {
		PrintWriter pw = new PrintWriter(f);
		pw.println("Hello These Is Printwriter Class");
		pw.println("Blah!!!:)");
		pw.close();
		System.out.println("Done:)");
	}catch(IOException o) {
		System.out.println(o);
	}
	
	}

}
/*
 * The Java.io.PrintWriter class prints formatted representations of objects to a text-output stream. This class implements
 *  all the print methods that are found in printstream.
 */
