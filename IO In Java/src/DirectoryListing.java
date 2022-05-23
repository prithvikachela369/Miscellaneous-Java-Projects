import java.io.File;

public class DirectoryListing {

	public static void main(String[] args) {
		String[] paths;
		
		File i = new File("H:\\javaProgramdirectory");
		
		paths = i.list();
		
		for(String p : paths) {
			System.out.println(p);
		}
	}

}
