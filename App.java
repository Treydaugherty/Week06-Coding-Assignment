package Week06CodingFinal;



public class App {

	public static void main(String[] args) {
		Deck deck = new Deck();
		
		
//		for (Card card: deck.cards) {
//		card.describe();
//	}
		//This describes the players
		Player player1 = new Player("Tom");
		Player player2 = new Player("Jack");

		deck.shuffle();
		
		//This sets the game up.
		for (int i = 0; i < 52; i++) {
			if (i % 2 == 0) {
				player1.draw(deck);
				}
			else {
			player2.draw(deck);
			}
		}
	
		
		for (int i = 0; i < 26; i++) {
		Card card1 = player1.flip();
		System.out.println(player1.getPlayerName() + " card is ");
		card1.describe();
		Card card2 = player2.flip();
		System.out.println(player2.getPlayerName()+" card is ");
		card2.describe();
		System.out.println();
		//This is the scoring system.
		if (card1.getRank() > card2.getRank()) {
			player1.incrementScore();
			System.out.println( player1.getPlayerName() + " wins the round!");
			System.out.println();
		}
		
		else if (card2.getRank() > card1.getRank()) {
			player2.incrementScore();
			System.out.println(player2.getPlayerName()+" wins the round!");
			System.out.println();
		} else {
			System.out.println("It's a draw!");
			System.out.println();
		}
		}
		//This compares final scores.
		if (player1.getScore() > player2.getScore() ) {
			System.out.println("------------------------");
			System.out.println(player1.getPlayerName() +" wins!!");
			System.out.println("Final score: " + player1.getScore()+ " vs " + player2.getScore());
		}
		else if (player1.getScore() < player2.getScore() ) {
			System.out.println("------------------------");
			System.out.println(player2.getPlayerName()+" wins!!");
			System.out.println("Final score: " + player2.getScore()+ " vs " + player1.getScore());
		}
		else {
			System.out.println("------------------------");
			System.out.println("It's a draw!!");
			System.out.println("Final score: " + player1.getScore()+ " vs " + player2.getScore());
		}
	}

}
