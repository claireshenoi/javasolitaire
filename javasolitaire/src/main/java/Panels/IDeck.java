// Author: Sam Shenoi
// Description: This file defines the facedown deck.
package Panels;

import java.awt.Dimension;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPanel;

import javasolitaire.Card;
import javasolitaire.Deck;

// This file defines an interface for the facedown deck. 
public class IDeck extends JPanel {
	private ICard top;
	private Deck deck; 
	
	public IDeck(Deck d) {
		deck = d; 
        top = new ICard(deck.getTop());
        top.toggleVisible(false);
        add(top);
        
       
		
	}
	public ICard drawCard() {
		Card c = deck.getTop();
		top = null; 
		if (c != null) {
			top = new ICard(deck.getTop());
		}
		 
		return top;
	}
	@Override
	public Dimension getPreferredSize() {
	        return new Dimension(200, 200);
	}
	

}
