import java.io.*;
public class createFile {

	public static void main(String[] args) throws IOException {
		try {
	File f = new File("H:\\JavaIOFiles\\pk.pptx");	
	if(f.createNewFile()) {
		System.out.println("File Created "+f.getName());
	}else {
		System.out.println("File Already Exists");
	}
		}catch(Exception e) {
			System.out.println("An Error Occured");
		}
	}

}
