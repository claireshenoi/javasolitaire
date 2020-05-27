// Author: Sam Shenoi 
// Description: This file defines a panel for the card
package Panels;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

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
		
	}
	public void setComponent() {
		Component[] componentList = this.getComponents();

		//Loop through the components
		for(Component c : componentList){

		    //Find the components you want to remove
		    if(c instanceof ICard){

		        //Remove it
		        this.remove(c);
		    }
		}

		
		//Depending on if the card is faceup or not do something 
		if (this.c.getIsFaceUp()) {
			Suit w = c.getS();
			BufferedImage i = w.getSuit();
			setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
			
			// Init the picture to the suit picture
			
			ImageIcon heart = new ImageIcon(i);
			Image modifiedHeartImage = heart.getImage().getScaledInstance(40,40, java.awt.Image.SCALE_SMOOTH);
			num = new JLabel(c.getNum());
			num.setHorizontalAlignment(SwingConstants.RIGHT);
			pic = new JLabel(new ImageIcon(modifiedHeartImage));
			
			add(num);
			add(pic);
			add(new JLabel(c.getNum()));
		}else {
			try {
				Image img = ImageIO.read(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("playing-card-back.jpg")));
				img.getScaledInstance(40, 40, java.awt.Image.SCALE_SMOOTH);
				add(new JLabel(new ImageIcon(img)));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		/*if (c.getIsFaceUp()) {
			//Display the stuff 
		}else {
			//Display 
			add(cardBack);
		}*/
		//IMPORTANT
		this.revalidate();
		this.repaint();
		
	}
	 @Override
	    public Dimension getPreferredSize() {
	        return new Dimension(200, 200);
	    }
	

}
