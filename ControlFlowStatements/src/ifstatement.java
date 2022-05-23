
import java.util.Scanner;

public class ifstatement {

	public static void main(String[] args) {
	//int x = 20;
	//int y = 100;
	 
	//Max of the number
	/*if(x > y) {
		System.out.println("x is greater than y");
	}
	if(y > x) {
		System.out.println("y is greater than x");
	}*/
	

		
		 System.out.println("Type any number to know That is it Even or Odd"); 
		
		Scanner s1 = new Scanner(System.in);
		long num = s1.nextLong();
		
	  if(num%2 == 0) {
		  System.out.println("The  number is even");  
	  }
	  if(num%2 != 0) {
		  System.out.println("The  number is odd");  
	  }
	}

}
