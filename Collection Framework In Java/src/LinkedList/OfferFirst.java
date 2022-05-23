package LinkedList;

import java.util.LinkedList;

public class OfferFirst {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.add("C");
        list.add("Java");
        list.add("C++");
        
        System.out.println("List before offerFirst() "+list);
        list.offerFirst("Python");
        System.out.println("list after offerFirst() "+list);

	}

}
