import java.util.Arrays;


public class Dealer {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		DeckOfCards deck = new DeckOfCards();
		
		deck.multipleCards(52);
		deck.numberLeft();
		System.out.println(deck.dealDeckImg());
		
		System.out.println(deck.findCardImg("10Hearts"));
	}

}