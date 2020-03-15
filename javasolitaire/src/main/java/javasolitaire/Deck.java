package javasolitaire;



import java.lang.Math; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;



import javax.swing.JFrame;
import javax.swing.JPanel;
public class Deck extends JPanel{
	//Data Abstraction 
	int DECK_SIZE; 
	Card [] deck; 
	int pos; 

	public Deck() {
		pos = 0; 
		DECK_SIZE = 52;
		deck = new Card[DECK_SIZE];
		int ndx = 0; 
		//Create the 10 number cards of different suits
		for(int i =2; i < 11;i++) {
			for(int y = 0; y < 4;y++) {
			  Suit s = null; 
			  switch (y) {
			     case 0: s = Suit.SPADE; break; 
			     case 1: s = Suit.CLUB; break; 
			     case 2: s = Suit.HEART; break; 
			     case 3: s = Suit.DIAMOND; break; 
			     default: break;  
			  }
			  this.deck[ndx] =  new Card(String.valueOf(i), i, s,-1);
			  ndx++; 
			}
		}
		//Create the face cards 
		for(int i = 0; i < 4; i++) {
			Suit s = null; 
			switch (i) {
			     case 0: s = Suit.SPADE; break; 
			     case 1: s = Suit.CLUB; break; 
			     case 2: s = Suit.HEART; break; 
			     case 3: s = Suit.DIAMOND; break; 
			     default: break;  
			}
			this.deck[ndx] =  new Card("Jack", 10, s,11);
			ndx++; 
			this.deck[ndx] =  new Card("Queen", 10, s,12);
			ndx++; 
			this.deck[ndx] =  new Card("King", 10, s,13);
			ndx++; 
			this.deck[ndx] =  new Card("Ace", 1, s,1);
			ndx++; 
		}
		if(ndx != DECK_SIZE) {
			System.out.println("Something went wrong in Deck!");
		}		
	}
	
	
	public Card getTop() {
		Card d =  this.deck[pos];
		pos ++; 
		return d; 
		
	}
	public void shuffle() {
	   for(int i = 0; i < DECK_SIZE; i ++) {
		   int r = (int) (Math.random() * 52);
		   
	       Card temp = deck[i];
	       deck[i] = deck[r];
	       deck[r] = temp; 
	   }
	   
	}


}
