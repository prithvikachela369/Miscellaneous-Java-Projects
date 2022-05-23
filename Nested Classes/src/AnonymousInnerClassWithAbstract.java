abstract class ano{
public abstract void display();	
}
public class AnonymousInnerClassWithAbstract {

	public static void main(String[] args) {
		ano n = new ano() {
		
		//Overriding the display method
		public void display() {
			System.out.println("From anonymous class :)");
		}
		
		};
		n.display();
	}

}
