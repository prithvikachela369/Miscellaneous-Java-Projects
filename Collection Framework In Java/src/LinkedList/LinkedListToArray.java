package LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListToArray {

	public static void main(String[] args) {
    LinkedList<String> list = new LinkedList<String>();
	list.add("Java");
	list.add("Python");
	list.add("C");
	list.add("C++");
	list.add("JavaScript");
	int size = list.size();
	System.out.println("The size of the LinkedList is "+list.size());
	String[] numbers = new String[size];
	numbers =  list.toArray(numbers);
	System.out.println("Elements of Arrays Are:");
	for(String s1 : numbers) {
		System.out.println(s1);
	}
	}

}
