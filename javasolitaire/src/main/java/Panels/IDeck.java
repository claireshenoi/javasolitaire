// Author: Sam Shenoi
// Description: This file defines the facedown deck.
package Panels;

import java.awt.LayoutManager;

import javax.swing.JPanel;

import javasolitaire.Deck;

// This file defines an interface for the facedown deck. 
public class IDeck extends JPanel {
	private ICard top;
	private Deck deck; 
	
	public IDeck(Deck d) {
		deck = d; 
        top = new ICard(deck.getTop());
		
	}
	public ICard drawCard() {
		top = new ICard(deck.getTop()); 
		return top;
	}

}
