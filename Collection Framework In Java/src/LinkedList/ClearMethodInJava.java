package LinkedList;

import java.util.LinkedList;

public class ClearMethodInJava {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Hello");
		list.add("Machine");
		list.add("How's");
		list.add("It");
		list.add("Going");
		
		System.out.println("Linked List Before Clearing : "+list);
		
		list.clear();
		
		System.out.println("Linked List After Clearing "+list);
		
		list.add("Wow");
		list.add("it's");
		list.add("Silcon");
		list.add("Valley");
		
		System.out.println("Linked list After Adding Values "+list);
	}

}
