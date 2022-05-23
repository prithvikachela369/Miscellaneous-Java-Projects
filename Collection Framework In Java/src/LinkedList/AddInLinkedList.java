package LinkedList;

import java.util.LinkedList;

public class AddInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("Aliens");
		list.add("Message");
		System.out.println("The before list is "+list);
		list.add("from");
		list.add("Humans");
		System.out.println("The after list is "+list);
	}

}
