
public class localInnerClasses {
	String s = "This is the class inside a Method :)";
public void outMethod() {
	class inner{
		public void display() {
			System.out.println("Message from inner class : "+s);
		}
	}
	
	inner in = new inner();
	in.display();
}
	public static void main(String[] args) {
		localInnerClasses li = new localInnerClasses();
	    li.outMethod();
	}

}
