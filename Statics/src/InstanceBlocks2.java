
public class InstanceBlocks2 {

	InstanceBlocks2(){
		System.out.println("Inside Constructor-2");
	}
	public static void main(String[] args) {
		InstanceBlocks2 obj = new InstanceBlocks2();
		System.out.println("-----");
		InstanceBlocks2 obj1 = new InstanceBlocks2();
		System.out.println("-----");
	}
	{
		System.out.println("IIB");
	}
	{
		System.out.println("IIB-2");
	}
	//Here also the two IIB's Executed first and then constructors and main method gets executed
}
