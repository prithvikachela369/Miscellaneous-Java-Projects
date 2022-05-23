class parent{
	static int o = 9;
}
class child extends parent{
	static {
		o = 3;
	}
}
public class StaticInheritance {

	public static void main(String[] args) {
		System.out.println("o = "+child.o);
	}
//STATIC MEMBER VARIABLE DO NOT INHERIT
}
