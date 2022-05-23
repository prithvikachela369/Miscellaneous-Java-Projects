import java.util.Scanner;


public class switchcasestatements {

	public static void main(String[] args) {
		
		Scanner pk = new Scanner(System.in);
		int day = pk.nextInt();
		
		switch(day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.err.println("Not A Valid Number!!!");
			break;
		}

       
		//For String values
		String dog = "St. Bernard";
		
		
		switch(dog) {
		case "Great Dan":
			System.out.println("Wow! Too Big");
			break;
		case "St. Bernard":
			System.out.println("Wow! So cute And Small");
			break;
		default:
			System.err.println("Not A Valid Dog Name !!!");
		}
		
	}

}



















