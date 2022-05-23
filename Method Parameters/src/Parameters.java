
public class Parameters {

	public static void main(String[] args) {
		printInfo("Blah!!!", 10);
        //System.out.println(add(46895 , 100000));
		int result1 = add(23 , 90);
		int result2 = add(10 , 30);
		int result3 = add(14 , 68);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}
	public static void printInfo(String name, int age) {
		System.out.println(name+"'s age is "+age);
	}
	public static int add(int x, int y) {
		return x + y;
	}

}
