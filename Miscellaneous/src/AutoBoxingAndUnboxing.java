
public class AutoBoxingAndUnboxing {
public static void main(String[] args) {
	int i = 10;//Primitive Data Type
	Integer ii = new Integer(i);//Wrapper Class
	System.out.println(ii);
	//Putting primitive variable in the reference Type is known as Boxing OR Wrapping
	
	int j = ii.intValue();//Here we are taking out the value from the Reference type, this is called Unboxing or Unwrapping
	System.out.println(j);
	
	Integer value = i;//Instead we Can Also Do this, It is called AutoBoxing
	
	int a = value;//We can also do this, It is called autoUnboxing
	
	String str = "2322";
	int pk =Integer.parseInt(str) ;
	System.out.println(pk);
}
}
