class out{
	static String hello = "Static Variable from Class out :)";
	static int bello = 123456;
	static class in{
		public static void display() {
			System.out.println("Message from class in : "+hello);
			System.out.println("Another Message from class in : "+bello);
		}
	}
}
public class staticInnerClass {

	public static void main(String[] args) {
		//creating in class object
		out.in i = new out.in();//for accessing static class
		i.display();
	}

}
