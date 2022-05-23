public class StaticBlocks {

	static String a = "";
	
	static {
		a = "Hello People";
	}
	
	static {
		a = "Hello Aliens";
	}
	
	public static void main(String[] args) {
	
		System.out.println("The Value Of a : "+a);
	}
	//In Java the static block gets executed first and then the main method is executed
	static {
		System.out.println("In Static");
	}
	static {
		System.out.println("In Static-2");
	}

}
