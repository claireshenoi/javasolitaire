package javasolitaire;



import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
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
	
	private Queue<Card> deck;
	private int pos;
	final int DECK_SIZE = 52; 

	public Deck(){
		deck = new LinkedList<Card>();
		Suit s [] = {new Diamond(), new Spade(), new Club(), new Heart() }; 
		List<Card> arr = new ArrayList<Card>(); 
		for (int y=0; y < 4; y++) {
			arr.add(new Card("Ace", s[y]));
			for (int i = 2; i < 11; i ++) {
				arr.add(new Card("" + i , s[y]));
			}
			arr.add(new Card("King", s[y]));
			arr.add(new Card("Jack", s[y]));
			arr.add(new Card("Queen", s[y]));	
		}
		// Shuffle the deck after creating it; 
		Collections.shuffle(arr);
		
		for(int i =0; i < arr.size();i++) {
			deck.add(arr.get(i));
		}
		
		// Set the top card equal to the start index
		this.pos = 0; 
		
	}
	
	public Card getTop() {
		// returns the top card of the queue or null if empty
		return deck.poll();
	}
	

 
	


}
