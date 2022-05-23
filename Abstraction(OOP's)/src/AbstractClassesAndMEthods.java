abstract class dog{
	String breed = "Great Dam";
	
	public void bark() {//Non-Abstarct Method
		System.out.println("Bark!!");
	}
	public abstract void poop();//Abstract Method
}
class chuchi extends dog{
	public void poop() {
		System.out.println("Dog Pooped!!");
	}
}


public class AbstractClassesAndMEthods {

	public static void main(String[] args) {
		
    chuchi s = new chuchi();
    s.bark();
    //When we do it through the chuchi class which extends dog and then when we call it from the main method, it works
	s.poop();	
	System.out.println(s.breed);
	}

}
