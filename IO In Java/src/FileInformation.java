import java.io.File;

public class FileInformation {

	public static void main(String[] args) {
		File g = new File("H:\\JavaIOFiles\\info.txt");
		if(g.exists()) {
			System.out.println(g.getName());
			System.out.println(g.getAbsolutePath());
			System.out.println(g.canRead());
			System.out.println(g.canWrite());
			System.out.println(g.length());
		}else {
			System.out.println("The File Does'nt Exists:(");
		}
	}

}
