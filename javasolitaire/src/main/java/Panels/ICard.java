// Author: Sam Shenoi 
// Description: This file defines a panel for the card
package Panels;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javasolitaire.Card;

public class ICard extends JPanel{
	Card c; 
	JLabel num; 
	JLabel pic; 
	JLabel cardBack; 

	public ICard(Card q) {
		this.c = q; 
		// Init the picture to the suit picture
		pic = new JLabel(new ImageIcon(c.getS().getSuit()));
		num = new JLabel(c.getNum());
		cardBack = new JLabel();
		
		if (c.getIsFaceUp()) {
			//Display the stuff 
		}else {
			//Display 
		}
	}

}
