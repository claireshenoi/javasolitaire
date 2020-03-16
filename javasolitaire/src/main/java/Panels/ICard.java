// Author: Sam Shenoi 
// Description: This file defines a panel for the card
package Panels;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javasolitaire.Card;
import javasolitaire.Suit;

public class ICard extends JPanel{
	Card c; 
	JLabel num; 
	JLabel pic; 
	JLabel cardBack; 

	public ICard(Card q) {
		this.c = q; 
		setComponent();
		
	}
	public void toggleVisible(boolean b) {
		this.c.setIsFaceUp(b);
		setComponent();
		this.revalidate();
	}
	public void setComponent() {
		Suit w = c.getS();
		BufferedImage i = w.getSuit();
		
		
		// Init the picture to the suit picture
		pic = new JLabel(new ImageIcon(i));
		num = new JLabel(c.getNum());
	
		try {
			cardBack = new JLabel(new ImageIcon(ImageIO.read(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("playing-card-back.jpg")))));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		/*if (c.getIsFaceUp()) {
			//Display the stuff 
		}else {
			//Display 
			add(cardBack);
		}*/
		
	}

}
