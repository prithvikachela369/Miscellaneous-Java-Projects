import java.io.*;

public class ByteStream {

	public static void main(String[] args) throws IOException {
	FileInputStream in = null;
	FileOutputStream out = null;
	
	try {
		in = new FileInputStream("H://JavaIOFiles//input.txt");
		out = new FileOutputStream("H://JavaIOFiles//output.txt");
		int c;
		
		while((c = in.read()) != -1) {
			out.write(c);
		}
	}finally {
		if(in != null) {
			in.close();
		}
		if(out != null) {
			out.close();
		}
	}
	}

}
//byte streams to perform input and output of 8-bit bytes.
