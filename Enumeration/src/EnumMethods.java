enum colors{
	RED,GREEN,BLUE
}
public class EnumMethods {

	public static void main(String[] args) {
		colors[] arr = colors.values();
		
		for(colors col: arr) {
		System.out.println(col+ " At Index "+col.ordinal());
		}
		System.out.println(colors.valueOf("RED"));
	} 
}
