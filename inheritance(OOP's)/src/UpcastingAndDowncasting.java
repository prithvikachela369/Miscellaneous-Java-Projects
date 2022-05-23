class machine{
   void mech() {
		System.out.println("A Machine is an interesting thing");
	}
}
class mediumMachine extends machine{
	 void mech() {
		System.out.println("mediumMachine also reduces human effort");
	}
	 void mech2() {
		System.out.println("smallMachines can be used at home");
	}
}


public class UpcastingAndDowncasting {
  public static void main(String[] pk) {
	machine m1 = new machine();
	mediumMachine m2 = new mediumMachine();
	
	
	//m1.mech();
	//m2.mech();
	
	
	machine p =  new mediumMachine();//UPCASTING
	p.mech();//overrides
	
	
	//Instanceof Operator 
	//It return a boolean value
	
	if(p instanceof  mediumMachine) {
       
		machine p1 = new mediumMachine();
		mediumMachine g = ( mediumMachine )p1;//DOWNCASTING
		g.mech();
		g.mech2();
	}
}
}









