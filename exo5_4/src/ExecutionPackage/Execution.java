package ExecutionPackage;

import TextIO.TextIO;
import Deck.Deck;
import BlackjackHand.BlackjackHand;

public class Execution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BlackjackHand bjHand = new BlackjackHand();
		Deck deck = new Deck();
		/**
		 * pick a random number between 2 and 6
		 */
		boolean bool = true;
		while (bool == true){
			int rand = (int) (Math.random() * (6 - 2)) + 2;
		
			deck.shuffle();
			/**
			 * add the cards to the Hand and print the cards
			 */
			for (int i = 0; i < rand; i++){
				bjHand.addCard(deck.dealCard());
				System.out.println(bjHand.getCard(i).toString());
			}
			/**
			 * print the value
			 */
			System.out.println(bjHand.getBlackjackValue());
			System.out.println("Again ?");
			bool = TextIO.getlnBoolean();
		}

	}

}
