
public class throwInException {
	
	static void throwDemo() {
		try {
			String b = "Demo";
			throw new ArithmeticException(b);//It throw the ArithmeticException
		}catch(ArithmeticException | ArrayIndexOutOfBoundsException f) {//This catch block catches the exception 
			String a = "Caught";
			System.out.println("Exception "+a);
		}
	}
	/*
	 Unchecked exceptions are not checked at compile time. It means if your program is throwing an unchecked exception and even if
	 you didn’t handle/declare that exception, the program won’t give a compilation error. Most of the times these exception occurs
	 due to the bad data provided by user during the user-program interaction. It is up to the programmer to judge the conditions
	 in advance, that can cause such exceptions and handle them appropriately. All Unchecked exceptions are direct sub classes of
	 RuntimeException class.
	 */

	public static void main(String[] args) {
		throwDemo();
	}

}
