
public class returnStatement {

	public static void main(String[] args) {
		printMessage();//Calling The printMessage and printing "Hey There !"
	int sum = 	numbers(5, 49);//We call the method numbers and passing it two parameters in the main method
	System.out.println(sum);
	/*
	first it prints "Hey There !" then we put return type in the numbers method it returns the value in the form of a + b to the 
	main method, then in the main method we give the called method values of 5, 49 (Here) and this becomes 5 + 49 and it this 
	value is assigned to the sum of integer type and 5 + 49(54(Here)) is being printed 
	*/
	
	}
	
	public static void printMessage() {
		System.out.println("Hey There !");
	}
	
	public static int numbers(int a, int b) {
       return a + b;
	}

}
