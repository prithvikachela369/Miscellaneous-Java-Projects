package LinkedList;

import java.util.LinkedList;

public class PopInLinkedList {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.push("A");
		list.push("B");
        String s = list.pop();//pop removes first element from the list
        System.out.println(s);
        list.push("C");
        System.out.println(list);
	}

}
