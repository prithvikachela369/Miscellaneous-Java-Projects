class outer{
	
	 int a = 10;
	private  int b = 100;
	static int c = 1000;

	//the below class is member innner class
	class inner{// this inner class file name will be outer$inner.class
		public void display() {
			System.out.println("Message from inner class !!");
			System.out.println("The sum is "+(a+b+c));
		}
	}
}
public class InnerClassesorMemberClasses {// or also known as non-static class

	public static void main(String[] args) {
		outer o = new outer();
		
		outer.inner i = o.new inner();//For accesing the inner class(syntax) 
		i.display();
		
		
	}

}
