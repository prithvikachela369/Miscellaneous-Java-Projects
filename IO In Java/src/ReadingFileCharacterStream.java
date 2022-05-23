import java.io.*;
public class ReadingFileCharacterStream {

	public static void main(String[] args) throws IOException{
		FileReader r = null;
		
		try {
			r = new FileReader("H:\\reading char stream.txt");
			int i;
			while((i = r.read()) != -1) {
				System.out.print((char)i);
			}
			r.close();
		}catch(Exception i) {
			System.out.println(i);
		}
	}

}
