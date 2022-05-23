
public class StringsIntroduction {

	public static void main(String[] args) {
		//Interned Way or String Literals
		//Stored In String Pool
		String s = "Tom";
		String s2 = "Tom";
		//s and s2 are Refrence variable pointing to the same literal
		
		if(s == s2) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		// Above we are comparing s and s2 hashcodes not the content("Tom")
		
		//Making Strings By objects
		String s3 = new String("Jerry");
		String s4 = new String("Jerry");
		//Above The refrence variables are pointing to two different refrences in the heap memory
		
		//Now we compare the hashcode of both the Strings
		if(s3 == s4) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		//The output is "!=" as the String objects point to different hashcodes in the heap
		
		//If we want to compare Strings we use equals() method
		//As .equals() method compares the content not the hashcode
		
		if(s3.equals(s4)) {
			System.out.println("==");
		}else {
			System.out.println("!=");
		}
		
		if(s3.compareTo(s4) == 0) {
			System.out.println("Compared");
		}else {
			System.out.println("Not Compared");
		}
		
		//Some More Methods For Strings
		
		String names = "Tom,Jerry,ShinChan,Nobita,Suniyo";
		int len = names.length();
		System.out.println(len);//It will print the number of characters in the string 
		System.out.println(names.charAt(0)+ " | " +names.charAt(len-1));
		
		names.toUpperCase();
		System.out.println(""+names);//No changes Happened as Strings are immutable
		//So we have to Generate a new string
		String newString = names.toUpperCase();
		System.out.println(newString);
		
		if(names.contains("Tom")) {
			System.out.println("Tom is there");
		}else {
			System.out.println("Tom is not there");
		}
		
		String s5 = names.substring(10);//Prints the value starting from index 10
		System.out.println(s5);
		
		String s6 = names.substring(4, 8);//Prints value from 4th index to 7th index(between 4 and 8)
		System.out.println(s6);
		
		String s7 = names.replace('S', 'L');//Replaces S and puts L to it
		System.out.println(s7);
		
		char[] arr = names.toCharArray();//Converts all String Letters to chars
		for(char i = 0 ; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		String[] arr2 = names.split(",");
		for(String s1:arr2) {
			System.out.println(s1.trim());
		}
		
		String email = "tony1234example.com";
		
		if(!email.isEmpty()) {
			System.out.println("Email is available");
		if(!(email.contains("@") && email.contains("."))) {
			System.err.println("Email is Not Valid !!");
		}else {
			System.out.println("Email is valid");
		}
		}else {
			System.err.println("Please provide an E-mail !!");
		}
		
		String s8 = names.concat(",Hello");//Adds it to last of the String
		System.out.println(s8);
		
		
		//Run-time Polymorphism as it overrides 
		CharSequence cs = null;
		cs = new String("Hello");
		cs = new StringBuffer("Bye");
		cs = new StringBuilder("Awesome!!");
		System.out.println(cs);
	}

}


















