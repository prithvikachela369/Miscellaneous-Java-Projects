
public class LabeledAndUnlabeledBreakKeyword {

	public static void main(String[] args) {
		
		//UnLabeled Break Keyword
		/*for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3) {
					break;
				}
				System.out.print("* ");
			}
			  System.out.println();
		}*/
		
		//Labeled Break Keyword
		pk:
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3) {
					break pk;
				}
				System.out.print("* ");
			}
			  System.out.println();
		}
	//In Break Keyword It is Executing upto 2 only and then breaks the whole loop
	}

}
