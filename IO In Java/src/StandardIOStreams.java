import java.io.*;
public class StandardIOStreams {

	public static void main(String[] args) throws IOException {
		InputStreamReader s1 = null;
		try {
			s1 = new InputStreamReader(System.in);
			System.out.println("Enter 'e' for Entering");
			
			char c;
			
			do {
				c = (char) s1.read();
				System.out.println(c);
			}while(c != 'e');
		}finally {
			if(s1 != null) {
				s1.close();
			}
		}
	}

}
