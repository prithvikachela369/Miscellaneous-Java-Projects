import java.util.ArrayList;
import java.util.Scanner;

public class whileloop {

	public static void main(String[] args) {
		
		//int a = 0;
		
		/*while(a < 10) {
			System.out.println("a is less than "+a );
			a++;
		}*/
		//The above while loop does same as the below for loop
		/*for(int i = 0; i < 10; i++) {
			System.out.println("a is less than "+i );
		}*/
		/*do {
			System.out.println("a");	
		}while(false);*/
		//it first executes the code in do (printing a) then sees while, if its true it will got to the top and repeat it continuosly
	
		String sentence = "Hello Aliens ! How are you ?";
		Scanner scan = new Scanner(sentence);
		ArrayList words = new ArrayList  (); 
		
		while(scan.hasNext()) {
			words.add(scan.next());
		}
		
		  System.out.println(words);
	}

}







