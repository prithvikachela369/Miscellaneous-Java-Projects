 abstract class elements{
	 static int a;
	 static int b;
elements(int a, int b){
	this.a = a;
	this.b = b;
}	
}
// A CONSTRUCTOR CANNOT BE IN AN INTERFACE
class blah extends elements{
	
	String str;

	blah(int a, int b,String str) {
		super(a, b);
		this.str = str;
	}
	
}

public class ConstructorsWithAbstractClasses extends blah {

	ConstructorsWithAbstractClasses(int a, int b, String str) {
		super(a, b, str);
		
	}
	public void displ() {
		System.out.println(a+" "+b+" "+str);
	}

	public static void main(String[] args) {
		ConstructorsWithAbstractClasses b = new ConstructorsWithAbstractClasses(10,20, "Hello");
		b.displ();
	}
	
}