
public class Main {
	public static void main(String[] args) {
		Class1 c = new Class1();
		Class1 d = new Class1();
		System.out.println(c.a);
		System.out.println(d.a);
		
	    d.printHi();
		System.out.println(d);
		
		
		System.out.println(main2(4,5)+main2(1,5));
		
		
		
		//Calling the method
		Main m = new Main();
		System.out.println(m.pk(10, 4));
		
	}
	
	//Method Signatures
	
	public static int main2(int x, int y) {
		int sum = x+y;
		return x+y;
	}
	public int pk(int x, int y) {
		if(x >y) {
			return x;
		}
		else {
			return y;
		}
	}
	
}
