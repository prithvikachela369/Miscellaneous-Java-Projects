import java.util.Scanner;
import java.util.Random;
enum casino{
	TotalBalance(100);
    private int i;
	casino(int i) {
		this.i = i ;
	}
	int getCasino() {
		i = i + 20;
		return i;
	}
	int getCasino1() {
		return i;
	}
	
		int getCasino2() {
			i = i - 10;
			return i;
		}
}

public class CasinoGame {

	public static void main(String[] args) {
		System.out.println("\n..........Welcome To My Casino..........\n");
		System.out.println("Let Us Start!!!!");
		for(casino c3: casino.values()) {
		System.out.println("\t\t\t\t\tYour Current Balance Is "+c3.getCasino1() + " $ ");
		}
		Scanner s1 = new Scanner(System.in);
		boolean gameOver = false;
		int playerWon = 0;
		int noOfTrials = 0;
		Random r1 = new Random();
		while(!gameOver) {
			boolean validInput = false;
			System.out.println("\nDice Rolled!!\n");
			System.out.println("\nPlease Input The Predicted Number Between 1 and 6 And For Quiting Type 7.... ");
			int pre = s1.nextInt();
			int RandomNumber = 1+r1.nextInt(6);
			if(pre == 7) {
				gameOver = true;
			}
			
				
			if(pre > 7) {
				System.err.println("\nPlease Put A Valid Input !!!\n");
				gameOver = true;
			}
			
			do {
			validInput = true;
			
			
			
				 if(pre == RandomNumber) {
					System.out.println("Hurray!!! You Won!");
				    for(casino c2:casino.values()) {
					System.out.println("Now Your Balance Is "+c2.getCasino()+ " $");
					++playerWon;
				    }
				}else {
					System.out.println("Sorry :( You Lose");
					 for(casino c3:casino.values()) {
							System.out.println("Now Your Balance Is "+c3.getCasino2()+ " $");
				 }
					 ++noOfTrials;
				}
				
				
				
				
			}while(!validInput);
			
	
		
	}
		System.out.println("\nNumber Of Trials Are "+noOfTrials);
		System.out.println("\nYou Won "+playerWon+ " times\n");
		System.out.println("Bye!! Hope You Enjoyed Well :)");

}
}
