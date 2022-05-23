package LinkedList;

import java.util.LinkedList;

public class IndexOfMethod {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("Using");
		list.add("Indexof()");
		list.add("Method");
		
		System.out.println("Linked List: "+list);
		
		System.out.println("The index of 'Using' is "+list.indexOf("Using"));
		System.out.println("The index of 'Method' is "+list.indexOf("Method"));
	}

}
