interface waterBottleInterface{
	String color = "Blue";
	
	void FillUp();
}
interface Waterglass{
	String color2 = "Colorless";
	
	void Broked();
}


public class Interfacedemo implements waterBottleInterface , Waterglass{

	public static void main(String[] args) {
		
		Interfacedemo i = new Interfacedemo();
		i.FillUp();
		i.Broked();
		System.out.println(color);
		System.out.println(color2);
		
	}

	public void FillUp() {
		
		System.out.println("Filled It!!");
		
	}

	public void Broked() {
		// TODO Auto-generated method stub
		System.out.println("What you have broked the glass!!");
	}

}
