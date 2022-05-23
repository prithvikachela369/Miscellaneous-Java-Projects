import java.util.Scanner;
public class Forpractice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Forpractice2[] var = new Forpractice2[2];
		String temp;
		
		
		for(int i = 0; i < var.length; i++ ) {
			System.out.println("Enter the product name");
			temp = s.next();
			
			
			var[i] = new Forpractice2(); 
			var[i].setProduct(temp);
			
			
			
		}
		for(int i = 0; i < var.length; i++) {
			System.out.println("Product:"+var[i].getProduct());
		}
		
	}
}
