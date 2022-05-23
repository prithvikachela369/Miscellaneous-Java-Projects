
public class InstanceBlocks3 {
	
	int i;
	
	InstanceBlocks3(int i){
		this.i = i;
		System.out.println("Inside constructor");
	}
	public void display() {
		System.out.println(i);
	}
	

	public static void main(String[] args) {
		InstanceBlocks3 obj = new InstanceBlocks3(10);
		obj.display();
		System.out.println("-----");
		InstanceBlocks3 obj1 = new InstanceBlocks3(500);
		obj1.display();
		System.out.println("-----");
	}
	{
		System.out.println("Inside IIB");
	}
	{
		System.out.println("Inside IIB-2");
	}

}
