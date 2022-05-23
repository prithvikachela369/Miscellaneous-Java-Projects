package LinkedList;

import java.util.LinkedList;

public class SetMethod {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Apple");
		list.add("Mango");
		list.add("Banana");
		list.add("WaterMelon");
		
		System.out.println("List Before Setting: "+list);
		
		System.out.println("The object That is replaced is "+list.set(2, "Cherry"));
		System.out.println("The Second object That is replaced is "+list.set(3, "Kiwi"));
		
		System.out.println("List After Setting: "+list);
	}

}
