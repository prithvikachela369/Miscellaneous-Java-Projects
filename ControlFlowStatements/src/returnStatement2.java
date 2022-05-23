
public class returnStatement2 {

	public static void main(String[] args) {
		String saying = caps("what are you doing man ?");
		System.out.println(saying);
		
		int[] tello = bello(2,43,6);
		System.out.println(tello[0]);
		System.out.println(tello[1]);
		System.out.println(tello[2]);
		
	}
	
	public static String caps(String s) {
		return s.toUpperCase();
	}
	
	/*
	here we are calling the caps method from the main method and in the caps method we have passed a variable s of type String
	the return statement return "what are you doing man ?" in uppercase to the main method and it is assigned to the saying 
	identifier and finally we are printing it.
	 */
	
	public static int[] bello(int a, int b, int c) {
		int[] hii = new int[3];
		hii[0] = a;
		hii[1] = b;
		hii[2] = c;
		return hii;
	}

}
