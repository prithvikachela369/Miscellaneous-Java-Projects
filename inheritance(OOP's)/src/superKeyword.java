public class superKeyword {
	      int maxSpeed = 120;
	public void vroom() {
		System.out.println("Vroom! vroom");
	}
	int noDoors;
	/*superKeyword(){
		System.out.println("Vehicle Constructor");
	}*/
	superKeyword(){
		System.out.println("Vehicle Constructor w/ maxSpeed");
		this.maxSpeed = maxSpeed;
	}
	
	
}

class car extends superKeyword{
	
	//Super Keyword on variables
	
	/*static int maxSpeed = 100;*/
	
	public  void display() {
		System.out.println(super.maxSpeed);
	}
	
	//Super Keyword on methods
	
	public void vroom() {
		System.out.println("SKUUUURT!");
		super.vroom();
	}
	
	car(){
		super();
		System.out.println("Car Constructor");
		
	}
	
	
	
}












