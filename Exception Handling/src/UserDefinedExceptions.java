
public class UserDefinedExceptions {

	public static void main(String[] args) {
		
	try {
		
		throw new UserException(5);
		
	}catch(Exception e) {
		
		System.out.println(e);
	}
	}
	
}
class UserException extends Exception{
	static int a;
	UserException(int b){
		a = b;
	}
	public String toString() {
		return ("Exception Number : "+a);
	}
}
