
public class InstanceVariables {

	int c;
	
	public void add() {
		int a = 10;
		int b = 30;
		c = a + b;
		System.out.println("Added Result: "+c);
	}

	public void Subtract() {
		int a = 4000;
		int b = 3000;
		c = a - b;
		System.out.println("Subtracted Result: "+c);
	}
	
	public static void main(String[] args) {
		InstanceVariables is1 = new InstanceVariables();
		is1.add();
		is1.Subtract();
	}

}
