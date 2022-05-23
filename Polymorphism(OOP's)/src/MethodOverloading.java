

	
	public class MethodOverloading {
		
	int num1;
	int num2;
	String operation;
	

//Method Constructor Overloading
public  MethodOverloading() {
	num1 = 0;
	num2 = 0;
	operation = "NULL";
}
public  MethodOverloading(int h) {
	num1 = h;
	num2 = 0;
	operation = "NULL";
}
public  MethodOverloading(int h, int a) {
	num1 = h;
	num2 = a;
	
}
public  MethodOverloading(int h, int a,String op) {
	num1 = h;
	num2 = a;
	operation = op;
}
public static int sum(int x, int y) {
	return x + y;
}
public static int sum(int x, int y,int z) {
	return x + y + z;
}	
//Method overloading with different data types
public static void sayHi() {
	System.out.println("Hi!!");
}

public static String sayHi(String name) {
	return "Hi!!" + name;
}
	//OVERLOADED PARAMETERS MUST HAVE DIFFERENT PARAMETERS
public static void main(String[] args) {
	System.out.println("The sum is "+sum(4,5));
	System.out.println("The sum is "+sum(4,5,9));
	sayHi();
	System.out.println(sayHi("Hello Aliens"));
	
	 MethodOverloading obj = new  MethodOverloading (1,3,"Hii");//The calling depends on number of parameters we are passing in 
	                                                            //this object
	 System.out.println(obj.num1);
	 System.out.println(obj.num2);
	 System.out.println(obj.operation);
}
}
