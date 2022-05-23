enum Electric{
	Resistors,Transistors,Capacitors,IntegratedCircuits;
}
public class EnumsWithIfElse {

	public static void main(String[] args) {
		Electric parts = Electric.IntegratedCircuits;
		if(parts == Electric.Resistors) {
			System.out.println("They Oppose The Current");
		}
		else if(parts == Electric.Transistors) {
			System.out.println("They Fluctuates The Current");
		}
		else if(parts == Electric.Capacitors) {
			System.out.println("They Store The Electricity Tempararily");
		}
		else if(parts == Electric.IntegratedCircuits) {
			System.out.println("They Are The Combinations Of Many Transistors, It is Mainly Used In Computers");
		}
	}

}
