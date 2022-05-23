
public class InstanceBlocks {
	
	InstanceBlocks(){
		System.out.println("Inside Constructor");
	}
	{
		System.out.println("Inside IIB");
	}

	public static void main(String[] args) {
		InstanceBlocks obj = new InstanceBlocks();
		System.out.println("-----");
		InstanceBlocks obj1 = new InstanceBlocks();
		System.out.println("-----");
		InstanceBlocks obj2 = new InstanceBlocks();
		System.out.println("-----");
		//IIB gets executed every time we create objects and it will be also printed first
	}

}
