
public class ExceptionInJava2 {

	public static void main(String[] args) {
		//Nested try Block
		try {
		try {
			int num = Integer.parseInt("PK");
			System.out.println(num);
		}catch(NumberFormatException n) {
			System.out.println("An Exception Happened!");
		}
		try {
		int[] arr = new int[3];
		arr[9] = 10;
		System.out.println(arr[9]);
		}catch(ArrayIndexOutOfBoundsException o) {
			System.out.println("An Exception Occured!");
		}catch(Exception e) {
			System.out.println("Handled");
		}//Multi-Catch Blocks
		}catch(Exception e) {
			System.out.println("All Excpetions Recovered");
		}
		try {
			int num = Integer.parseInt("PK");
			System.out.println(num);
		}catch(NumberFormatException n) {
			System.out.println("An Exception Happened!");
		}finally {
			System.out.println("Finally Block Gets Always Executed");
		}
	}

}
