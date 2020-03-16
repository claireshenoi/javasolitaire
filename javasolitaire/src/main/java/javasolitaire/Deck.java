package javasolitaire;



import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;



import javax.swing.JFrame;
import javax.swing.JPanel;


public class Deck{
	//Data Abstraction 
	List<Card> deck; 
	int pos;
	final int DECK_SIZE = 52; 

	Deck(){
		Suit s [] = {new Diamond(), new Spade(), new Club(), new Heart() }; 
		deck = new ArrayList<Card>(); 
		for (int y=0; y < 4; y++) {
			deck.add(new Card("Ace", s[y]));
			for (int i = 2; i < 11; i ++) {
				deck.add(new Card("" + i , s[y]));
			}
			deck.add(new Card("King", s[y]));
			deck.add(new Card("Jack", s[y]));
			deck.add(new Card("Queen", s[y]));	
		}
		// Shuffle the deck after creating it; 
		this.shuffle();
		
		// Set the top card equal to the start index
		this.pos = 0; 
		
	}
	
	public Card getTop() {
		Card c = this.deck.get(this.pos++); 
		if(pos > DECK_SIZE) {
			c = new Card();
		}else {
			c = this.deck.get(this.pos++); 
		}
		return c;
	}
	
	
	// Shuffle the deck 
	public void shuffle(){
		Collections.shuffle(deck);
	}
	List<Card> getDeck(){
		return deck; 
	}
	


}
