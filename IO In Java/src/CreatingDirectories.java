import java.io.File;

public class CreatingDirectories {

	public static void main(String[] args) {
		File f1 = new File("H:\\javaProgramdirectory");
		
		if(!f1.exists()) {
			if(f1.mkdir()) {
				System.out.println("Directory Created!! :)");
			}else {
				System.out.println("Failed To Create Directory!! :(");
			}
			String dir = "H:\\javaProgramdirectory\\subDire\\di.txt";
			File f2 = new File(dir);
			f2.mkdirs();
		}
	}

}
