
public class shirt {
public static String color;
public static char size;

shirt(String newColor, char newSize){
	color = newColor;
	size = newSize;
}


public static void takeOn() {
	System.out.println("Shirt is on!");
}
public static void takeOff() {
	System.out.println("Shirt is off!");
}
public static void setColor(String newcolor) {
	color = newcolor;
}
public static void setSize(char newSize) {
	size = newSize;
}
}
