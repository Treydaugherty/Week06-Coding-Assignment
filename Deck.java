package Week06CodingFinal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	//Fields
		List<Card> cards = new ArrayList<Card>();
		 
		Deck(){
			
			String[] values = {"Two","Three","Four","Five","Six","Seven",
					"Eight","Nine","Ten","Jack","Queen","King","Ace"};
			
			String[] names = {"Diamonds", "Spades", "Hearts", "Clubs"};
			
			for (int i = 0; i < values.length; i++) {
				
				for (String name: names) {
					
					Card card = new Card(values[i], name, i);
					this.cards.add(card);
				
				}
			}
		}
		

		//Getters and Setters
		public List<Card> getCards() {
			return cards;
		}

		public void setCards(List<Card> cards) {
			this.cards = cards;
		}
		//Methods
		public void shuffle() {
			Collections.shuffle(this.cards);
		}
		
		public Card draw() {
			Card card = this.cards.remove(0);
			return card;
		}



		
		
		
}
