package practice;

public class MainMethod {

	public static void main(String[] args) {
	alien1 a1 = new alien1();
	a1.bigHead();
	a1.drive();
	a1.smallNose();
	a1.UFO();
	
	
	System.out.println("xxxxxxxxxxxxxxxxxxxx");
	
	alien2 a2 = new alien2();
	a2.bigHead();
	a2.dance();
	a2.drive();
	a2.smallNose();
	a2.UFO();
	
	System.out.println(a2.getcolor());
	
	System.out.println("xxxxxxxxxxxxxxxxxxxx");
	
	alien3 a3 = new alien3();
	a3.bigHead();
	a3.code();
	a3.drive();
	a3.smallNose();
	a3.UFO();
	
	System.out.println(a3.getcolor2());

	}

}
