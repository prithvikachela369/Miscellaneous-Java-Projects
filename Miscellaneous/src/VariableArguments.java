
public class VariableArguments {
	
	public static void display(String... values) {
		System.out.println("Display Method Invoked!!");
		for(String s : values) {
			System.out.println(s);
		}
	}
	public static void display2(int... values2) {
		System.out.println("Display2 Method Invoked!!");
		for(int s1 : values2) {
			System.out.println(s1);
		}
	}
	

	public static void main(String[] args) {
		
		display();//Calling without arguments
        display("Hello", "ALiens", "How", "Technology", "Going");//With 5 Arguments
        display("Bye","Aliens!!");//With 2 Arguments
        display2(1,2,3,4);//Also accepts integer values
        }

}
