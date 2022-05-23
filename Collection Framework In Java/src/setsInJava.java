import java.util.HashSet;
import java.util.Iterator;


/*
 // API's :- Application Programming Interfaces

  It is a document which gives you the list of all the packages, classes, and interfaces, along with their fields and methods.
   Using these API's, the programmer can know how to use the methods, fields, classes, interfaces provided by Java libraries.
 */
//NOTE:- Set Data Structures Dont Have Index from 0, It starts from 1
public class setsInJava {

	public static void main(String[] args) {
	HashSet<String> hs = new HashSet();
	
	//Here data is not approaching as in indexing approach
	hs.add("Java");
	hs.add("Python");
	hs.add("Kotlin");
	hs.add("Java");
	hs.add("C");
	hs.add("C++");
	hs.add("Java");
	hs.add("C");
	
	System.out.println(hs);
	//We can see that the data printed is unique and String is not repeated
	//And the output is Unordered because set puts it in ascending order based on hashcodes
	
	Iterator<String> itr = hs.iterator();
	
	while(itr.hasNext()) {
		String s = itr.next();
		System.out.println(s);
	}
	
	hs.remove("Kotlin");
	
	System.out.println(hs);
	
	if((hs.contains("Java")) && (hs.contains("C++")) && (hs.contains("Python"))) {
		System.out.println("They Are Object Oriented!!");
	}
	System.out.println(hs.size());
	}

}
