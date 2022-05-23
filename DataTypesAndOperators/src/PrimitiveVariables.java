
public class PrimitiveVariables {

	public static void main(String[] args) {
		long l = 500000000l; //takes upto 8 bytes
		int i = 5; // takes 4 bytes -> 32 bits
		short a = 5; // takes 2 bytes -> 16 bits and range of -32876 to 32767
        byte b = 5; // takes 1 byte -> 8 bits and range of -128 to 127
        float f = 5.5f;
        double d = 5.5f;
        
        char c = 'A';
        
        c = 66;
        
        System.out.println(c);// it will print the ASCII value (American standard code for information interchange
        
        
        double d1 = 5; //integer value can go into double which is called implicit conversion
        int k = (int)5.6;//it is called type casting means we are casting float value to int (Explicit conversion)
        System.out.println(d1);
        System.out.println(k);
        
        final float PI = 3.14f;//Declaring a constant
        System.out.println(PI);
        
        //literals are the constant values that appear on our program
        boolean b1 = true;
        boolean b2 = false;
        
        // true and false keywords are boolean literal
        
        //Any sequence of characters enclosed in double quotation marks are called string literals
        
        String h = "Hello Aliens";
        System.out.println("He said "+h);

	}

}
