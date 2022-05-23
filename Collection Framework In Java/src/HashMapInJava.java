import java.util.HashMap;

public class HashMapInJava {
	
	//Hashmap does'nt have order

	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		
		//Instead of above we can do hashmap by putting them into one hashmap
		
		HashMap<String, Integer> hm = new HashMap();
		hm.put("a", 1);
		hm.put("b", 2);
		hm.put("c", 3);
		
		System.out.println(hm);
		
		//Value of specific variable
		
		System.out.println(hm.get("c"));
		
		HashMap<String, String> hm2 = new HashMap();
		hm2.put("a", "A");
		hm2.put("b", "B");
		hm2.put("c", "C");
		
		//Removing an element
		
		hm2.remove("b");
		
		System.out.println(hm2);
		
		//checking the presence of a value and key
		
		System.out.println(hm2.containsValue("C"));
		System.out.println(hm2.containsKey("a"));
		
		System.out.println(hm2.size());
		
		System.out.println(hm2.replace("c", "b"));//Replaces C to b of the key c
		System.out.println(hm2);
		System.out.println(hm2.keySet());
		
		
	}

}



















