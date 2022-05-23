
public class nestedforloops {

	public static void main(String[] args) {
		for(int i = 0; i < 5; i++) {
			System.out.println("It's So Cold Outside");
		}
		
		System.out.println("--------------------");
		
		String[] colors = {"Blue", "Green","Black"};
		
		for(int i = 0; i < 3; i++) {
			System.out.println(colors[i]);
		}
		
		System.out.println("--------------------");
		
		String[][] fancycolors = {
				{"Red","Blue","Orange"},
				{"Aqua","Turquiose","YellowGreen"}
		};
		
		for(int row = 0; row < 2; row++) {
			for(int columns = 0; columns<3; columns++) {
				System.out.println(fancycolors[row][columns]);
			}
		}
	}

}
