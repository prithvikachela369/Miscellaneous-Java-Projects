
public class HashCodemain {

	public static void main(String[] args) {
		HashcodeInJava hj = new HashcodeInJava(10000233, "SpaceX");
		int value = hj.hashCode();
		System.out.println(value);
		
		HashcodeInJava hj2 = new HashcodeInJava(2000000, "Palantir");
		int value2 = hj2.hashCode();
		System.out.println(value);
	}

}
