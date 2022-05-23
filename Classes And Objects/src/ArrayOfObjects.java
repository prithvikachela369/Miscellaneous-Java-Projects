import java.util.Scanner;
public class ArrayOfObjects {
public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	Car[] cars = new Car[3];
	String temp;
	
	for(int i = 0; i < cars.length; i++) {
		System.out.println("Enter the car model please");
		temp = input.next();
		cars[i] = new Car();//Calling the constructors of the class and one by one instatnsiating it 
		cars[i].SetModel(temp);//setting String m = temp and thus m = model then model = temp
	}
	for(int i = 0; i < cars.length; i++) {
		System.out.println("Model:"+cars[i].getModel());
	}
}
}
