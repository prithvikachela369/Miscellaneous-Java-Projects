
public class equalsMethod {
	public static void main(String[] args) {
		String s1 = new String("Java");
		String s2 = new String("Java");
		
		if(s1 == s2) {
			System.out.println("Its Equal By '==' operator");
		}else {
			System.out.println("Its not Equal By '==' operator");
		}
		if(s1.equals(s2)) {
			System.out.println("Its Equal By .equals() operator");
		}else {
			System.out.println("Its not Equal By .equals() operator");
		}
		}
}
