
public class GenericFunctions {

	// ELement of type T
	static<T> void genDisplay(T element) {
		System.out.println(element.getClass().getName()+ " = " +element);//getName() returns the data type
	}
	public static void main(String[] args) {
		//With integer type
		genDisplay(12345+" Numbers");
		
		//With Float type
		genDisplay(9.63);
		
		//With String type
		genDisplay("Bello");
	}

}
