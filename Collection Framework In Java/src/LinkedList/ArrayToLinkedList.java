package LinkedList;

import java.util.LinkedList;

public class ArrayToLinkedList {

	public static void main(String[] args) {
		String[] color = {"Red","Blue","Orange"};
        LinkedList<String> list = new LinkedList<String>();
		
        for(String s: color) {
        	list.add(s);
        }
        System.out.println("The Values Stored In Array In The Form Of LinkedList :- "+list);
		
	}

}
