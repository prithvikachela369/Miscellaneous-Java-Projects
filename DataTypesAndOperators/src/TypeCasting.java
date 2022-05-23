
public class TypeCasting {

	public static void main(String[] args) {
		int a = 10;
		float b = a;//implicit conversion
		System.out.println("b' s value after implicit typecasting is "+b);//Widening conversion smaller value to bigger one 
		//And it is done by the compiler
		
		float c = 78.78f;
	
		
	int	d = (int)c;//explicit conversion
	System.out.println("The value of d after explicit conversion is "+d);//narrowing conversion bigger value to smaller one
	//And it is done by us
	}

}
