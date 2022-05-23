
public class LabeledAndUnlabeledContinueKeyword {

	public static void main(String[] args) {
		
		
		// UnLabeled Continue Keyword
		/*for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3) {
					continue;
				}
				System.out.print("/");
			}
			  System.out.println();
		}*/
		
		//Labeled Continue Keyword
		
		PKRano://A label
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				if(i == 3) {
					continue PKRano;
				}
				System.out.print("/");
			}
			  System.out.println();
		}
	//In Continue Keyword It is Not executing only the 3rd loop

	}

}
