package Week06CodingFinal;

import java.util.ArrayList;
import java.util.List;

public class Player {
	//Fields
	List<Card> hand = new ArrayList<Card>();
	int score = 0;
	
	private String playerName;

	public Player(String playerName) {
		this.playerName = playerName;
		this.score = 0;
	}
	//Getters and setters
	public List<Card> getHand() {
		return hand;
	}

	public void setHand(List<Card> hand) {
		this.hand = hand;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	//Methods
	public void describe() {
		System.out.println(playerName);
		System.out.println(hand);
	}

	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public Card flip() {
		Card card = hand.remove(0);
		return card;
	}
	
	public void incrementScore() {
		 this.score += 1;
	}
}