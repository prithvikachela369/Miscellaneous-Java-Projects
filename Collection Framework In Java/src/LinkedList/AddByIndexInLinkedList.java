package LinkedList;

import java.util.LinkedList;

public class AddByIndexInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		list.add("Hello");
		list.add("from");
		list.add("Humans");
		list.add("How");
		list.add("you");
		System.out.println("The before Index list is "+list);
		list.add(1,"Aliens");//It will be placed at 1st index
		list.add(2,"Message");//It will be placed at 2nd index
		list.add(6,"are");//It will be placed at 4th index
		System.out.println("The after Index list is "+list);

	}

}
