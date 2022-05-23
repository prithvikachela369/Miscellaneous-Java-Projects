import java.util.Scanner;
import java.util.Random;

enum HandSign{
	SCISSOR,ROCK,PAPER;
}
public class RockPaperScissorGame {

	public static void main(String[] args) {
		Random rand = new Random();
		boolean gameOver = false;
		HandSign playerMove = null ;
		HandSign computerMove;
		int numTrials = 0;
		int computerWon = 0;
		int playerWon = 0;
		int tie = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("\nLet Us Begin\n");
		while(!gameOver) {
			System.out.println("\nRock-Paper-Scissor\n");
			boolean validInput;
			do {
				System.out.println("Your Turn (s for scissor, r for rock, p for paper,q for quit)");
				char inChar = in.next().toLowerCase().charAt(0);
				validInput = true;
				if(inChar == 'q') {
					gameOver = true;
				}
				else	if(inChar == 's') {
					playerMove = HandSign.SCISSOR;
				}
				else	if(inChar == 'r') {
					playerMove = HandSign.ROCK;
				}
				else	if(inChar == 'p') {
					playerMove = HandSign.PAPER;
				}
				else {
					System.err.println("Please Enter A Valid Input!!!");
					validInput = false;
				}
			}while(!validInput);
			if(!gameOver) {
				int aRandomNumber = rand.nextInt(3);
				if(aRandomNumber == 1) {//We can put Any Number instead of one
					computerMove = HandSign.SCISSOR;
					System.out.println("\nIts My Turn : Scissor\n");
				}else if(aRandomNumber == 2) {
					computerMove = HandSign.PAPER;
					System.out.println("\nIts My Turn : Paper\n");
				}else {
					computerMove = HandSign.ROCK;
					System.out.println("\nIts My Turn : Rock\n");
				}
				if(computerMove == playerMove) {
					System.out.println("\nIt's A Tie\n");
					++tie;
				}else if((computerMove == HandSign.PAPER)&&(playerMove == HandSign.ROCK)) {
					System.out.println("\nPaper wraps Rock: I won!!\n");
					++computerWon;
				}else if((computerMove == HandSign.ROCK)&&(playerMove == HandSign.SCISSOR)) {
					System.out.println("\nRock breaks Scissor: I won!!\n");
					++computerWon;
				}
				else if((computerMove == HandSign.SCISSOR)&&(playerMove == HandSign.PAPER)) {
					System.out.println("\nScissor cuts Paper: I won!!\n");
					++computerWon;
				}else {
					System.out.println("\nCongratulation.....You Won\n");
					++playerWon;
				}
				++numTrials;
				
			}
		
			
		}
		System.out.println("Number Of Trials "+numTrials);
		System.out.printf("I won %d times and you won %d times\n", computerWon, playerWon);
		System.out.println("\nBye Bye!!! Hope You Enjoyed:)");
		}

}
