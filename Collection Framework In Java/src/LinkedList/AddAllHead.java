package LinkedList;

import java.util.*;

public class AddAllHead {

	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList<String>();
        list.add("Welcome");
        list.add("Titan");
        
        Collection<String> collect = new ArrayList<String>();
        collect.add("To");
        collect.add("The");
        collect.add("best");
        collect.add("Planet");
        collect.add("To");
        collect.add("Survive");
        
        System.out.println("The Linked list is "+list);
        list.addAll(1,collect);//the 1 shifts the string at 1st index to right side as elements are added
        System.out.println("The Linked list after is "+list);
	


	}

}
