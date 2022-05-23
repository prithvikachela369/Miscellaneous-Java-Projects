import java.util.Scanner;

public class customExceptions {
static void validateInput(int number) throws InvalidNumberException{
	if(number > 100) {
	throw new InvalidNumberException(null);
	}
	System.out.println("Valid Input");
}
	public static void main(String[] args) {
	Scanner s1 = new Scanner(System.in);
	for(int i = 0; i < 10; i++) {
	System.out.println("Enter a Number less than 100");
	int number = s1.nextInt();
	try {
		validateInput(number);
	}catch(InvalidNumberException f) {
		System.err.println("Caught Exception - Number Is Greater Than 100!!");
	}
	}
	}
}
/*
 If you are creating your own Exception that is known as custom exception or user-defined exception. Java custom exceptions are used to
 customize the exception according to user need.
 */
class  InvalidNumberException extends Exception{

	public InvalidNumberException(String s) {
	
	}
	
}