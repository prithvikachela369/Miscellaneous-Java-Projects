package LinkedList;

import java.util.LinkedList;

public class RemoveMethodInJava {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("People");
		list.add("Message");
		list.add("From");
		list.add("Aliens");
		
		System.out.println("Linked List : "+list);
		
		list.remove(3);//It will remove String from 3rd Index
		
		System.out.println("Final Linked List : "+list);
	}

}
