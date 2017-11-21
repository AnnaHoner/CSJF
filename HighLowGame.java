import java.util.Scanner;
import java.util.Random;

public class HighLowGame {

	public static void main(String[] args) {
		boolean finished = false;
		int random = 0;
		int random2 = 0;
		int count = 0;

		Random rn = new Random();
		random = rn.nextInt(13) + 1;
		
		System.out.println("Please note Ace takes the value of 1. \n");
		cardName(random);
		System.out.print("Enter Higher or Lower or Equal to cast your vote: ");

		while (!finished) {
			for (int i = 0; (i <= 4); i++) {
				random2 = (int) (Math.random() * 13 + 1);
				Scanner higherOrLower = new Scanner(System.in);

				if (higherOrLower.hasNext("Higher") || higherOrLower.hasNext("higher") || higherOrLower.hasNext("Hi")
						|| higherOrLower.hasNext("hi")) {
					System.out.print("\nYou chose higher. ");
					cardName(random2);

					if (random2 > random) {
						count += 1;
						roundCount(count);
						random = random2;
						System.out.print("Please cast your vote: ");
					} 
					else {
						lostRound(count);
						finished = true;
						break;
					}
				}

				else if (higherOrLower.hasNext("Lower") || higherOrLower.hasNext("lower") || higherOrLower.hasNext("Lo")
						|| higherOrLower.hasNext("lo")) {
					System.out.print("\nYou chose lower. ");
					cardName(random2);
					if (random2 < random) {
						count += 1;
						roundCount(count);
						random = random2;
						System.out.print("Please cast your vote: ");
					}
					else {
						lostRound(count);
						finished = true;
						break;
					}
				}

				else if (higherOrLower.hasNext("Equal") || higherOrLower.hasNext("equal") || higherOrLower.hasNext("Eq")
						|| higherOrLower.hasNext("eq")) {
					System.out.print("\nYou chose equal. ");
					cardName(random2);
					if (random2 == random) {
						count += 1;
						roundCount(count);
						random = random2;
						System.out.print("Please cast your vote: ");
					} 
					else {
						lostRound(count);
						finished = true;
						break;
					}
				} 
				else if (higherOrLower.hasNext("exit") || (higherOrLower.hasNext("quit"))
						|| (higherOrLower.hasNext("Exit")) || (higherOrLower.hasNext("Quit"))) {
					System.out.println("Goodbye. ");
					finished = true;
					higherOrLower.close();
					break;
				} 
				else
					System.out.print("Please enter higher or lower or equal (or type 'exit'): ");
			}
		}
	}

	public static void cardName(int cardValue) {
		if (cardValue == 1) 
			System.out.print("The card is Ace.\n");
		else if (cardValue == 11) 
			System.out.print("The card is Jack.\n");
		else if (cardValue == 12) 
			System.out.print("The card is Queen.\n");
		else if (cardValue == 13) 
			System.out.print("The card is King.\n");
		else
			System.out.print("The card is " + cardValue + ".\n");
	}

	public static void roundCount(int gameCount) {
		if (gameCount > 3) 
			System.out.print("You win! Congrats, you can now start again.");
		else
			System.out.print("Correct! You go to the next round!" + " \nYou are on round " + gameCount + "\n \n");

	}

	public static void lostRound(int gameCount) {
		if (gameCount == 1) 
			System.out.print("You lose. You got 1 attempt correct.\n");
		else
			System.out.print("You lose. You got " + gameCount + " attempts correct.\n");
	}

}
