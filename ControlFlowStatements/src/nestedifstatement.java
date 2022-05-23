import java.util.Scanner;


public class nestedifstatement {

	public static void main(String[] args) {
		
		System.out.println("What's Your Age ?");
		
		Scanner s = new Scanner(System.in);
		float age = s.nextFloat();
		
		if(age < 0.1) {
			System.out.println("Error! Please put Correct Age Input");
		}
		if(age < 50) {
			System.out.println("You are Young");
		}
		else if(age > 130) {
			System.out.println("Error! Please put Correct Age Input");
		}
		else {
			System.out.println("You are Old");
			
			if(age > 75) {
				System.out.println("You are really Old");
			}else {
				System.out.println("You aren't Really old !!!");
			}
		}

	}

}
