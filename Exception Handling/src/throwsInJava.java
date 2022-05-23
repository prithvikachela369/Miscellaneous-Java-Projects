
public class throwsInJava {
	/* 
	  Checked: are the exceptions that are checked at compile time. If some code within a method throws a checked exception,
	then the method must either handle the exception or it must specify the exception using throws keyword.
	*/
	static void avg() throws NullPointerException{
	System.out.println("Inside avg method");
	throw new NullPointerException();
	
		}
	

	public static void main(String[] args) {
		try {
			avg();
			
		}
		
		finally {
			System.out.println("Exception Happened");
		}
	}

}
