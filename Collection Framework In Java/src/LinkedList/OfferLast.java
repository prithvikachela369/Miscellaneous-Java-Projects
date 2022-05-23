package LinkedList;

import java.util.LinkedList;

public class OfferLast {

	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
        list.add("BMW");
        list.add("Tesla");
        list.add("Maruti Suzuki");
        
        System.out.println("List before offerLast() "+list);
        list.offerLast("Mercedes");
        System.out.println("list after offerlast() "+list);
	}

}
