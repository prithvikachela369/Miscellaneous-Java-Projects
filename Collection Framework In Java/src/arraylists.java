import java.util.ArrayList;
import java.util.Iterator;
public class arraylists {

	public static void main(String[] args) {
		
            String[] fruits = new String[3];
			fruits[0] = "Mango";
			fruits[1] = "Apple";
			fruits[2] = "Banana";
			
			System.out.println(fruits[2]);
			
			ArrayList<String> fruitslist = new ArrayList();
			
			fruitslist.add("Mango");
			fruitslist.add("Apple");
			fruitslist.add("Banana");
			//fruitslist.remove("Apple");
			//fruitslist.clear();
			//System.out.println(fruitslist.contains("Banana"));
			System.out.println(fruitslist);
			
			fruitslist.set(2, "Cherry");
			System.out.println(fruitslist);
			
			ArrayList<String> ar = new ArrayList();
			
			ar.add("Hello");
			ar.add("Bello");
			ar.add("Tello");
			
			System.out.println("===Iterating With Iterator===");
			Iterator itr = ar.iterator();
			//System.out.println(itr.next());
			//System.out.println(itr.next());
			//System.out.println(itr.next());
			
			while(itr.hasNext()) {
				Object str = itr.next();
				System.out.println(str);
				if(str.equals("Tello")) {
					itr.remove();
				}
			}
			System.out.println(ar);
			
	}

		}
