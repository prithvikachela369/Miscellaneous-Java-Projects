interface ano2{
	public void disp();
	int a = 100;
}
public class AnonymousInnerClassWithInterfaces {

	public static void main(String[] args) {
		ano2 a = new ano2() {

			@Override
			public void disp() {
				System.out.println("Message from interface to Anonymous class : Hello Method");
				System.out.println("Another Message from interface to Anonymous class : "+a);
			}
			
		};
		a.disp();
	}

	
	

}
