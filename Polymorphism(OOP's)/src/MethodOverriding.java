class a{
	public int i;

	public void main2() {
		
		System.out.println("A");
		System.out.println(i);
	}

	
}
//The below method overrides the method a
class b extends a{
	@Override//Rather giving logical error it gives compile time Error
	public void main2() {
		int i;
		i = 8;
		super.i = 1234;
		super.main2();//It will print both
		System.out.println("B");
		System.out.println(i);
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		b obj1 = new b();
        obj1.main2();
	}

}
