package LinkedList;

import java.util.LinkedList;

public class CloneInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Example");
		list.add("of");
		list.add("clone");
		list.add("method");
		
		System.out.println("The first linked list "+list);
		
		LinkedList<String> list2 = new LinkedList<String>();
		
		list2 = (LinkedList<String>) list.clone();
       System.out.println("The secong linked list(cloned) "+list2);
	}

}
