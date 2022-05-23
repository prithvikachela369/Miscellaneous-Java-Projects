
public class CompareToMethod {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Aliens";
		
		//Comparision Depends On Unicode Value Of The String 
		//if s1 < s2 Result will be Negative
		//if s1 > s2 Result will be Positive
		//if s1 = s2 Result will be 0
		
		System.out.println("Result: "+s1.compareTo(s2)); //s1 - s2
		
		String s3 = "Hello";
		String s4 = "HelloPeople";
		//Above After completion of Comparision Of Hello to Hello the number of characters in People will be the output
		
		System.out.println("Result: "+s3.compareTo(s4)); //s1 - s2
	}

}
