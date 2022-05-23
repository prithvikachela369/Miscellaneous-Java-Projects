package LinkedList;

import java.util.Collection;
import java.util.*;

public class AddAllEnd {

	public static void main(String[] args) {
	
			LinkedList<String> list = new LinkedList<String>();
	        list.add("Welcome");
	        list.add("To");
	        list.add("Titan");
	        
	        Collection<String> collect = new ArrayList<String>();
	        collect.add("The");
	        collect.add("best");
	        collect.add("Planet");
	        collect.add("To");
	        collect.add("Survive");
	        
	        System.out.println("The list before appending is "+list);
	        list.addAll(collect);
	        System.out.println("The list after appending is "+list);
		
	

	}

}
