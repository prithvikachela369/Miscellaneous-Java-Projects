
public class ExceptionInJava1 {

	public static void main(String[] args) {
		try {
		String s1 = null;
		System.out.println(s1.length());
		
		
		
		}catch(NullPointerException d) {
			System.out.println("The Value Of The String Is NULL!!");
		}
		try {
			int a = 10;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException a) {
			System.err.println("Cannot Divide By Zero!!");
		}
	}

}
