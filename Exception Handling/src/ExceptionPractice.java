
public class ExceptionPractice {

	public static void main(String[] args) {
		try {
			throw new HelloWorldException(51713271);
		}catch(HelloWorldException hwe) {
			System.err.println("Not a correct Spelling");
			System.err.println("ERROR Code:- "+hwe);
		}
	}

}
class HelloWorldException extends Exception{
  static String str = "HelloWld";
  static int errCode ;
  HelloWorldException(int err){
	  this.errCode = err;
  }
  public String toString() {
	return str + errCode;
	   }
}
