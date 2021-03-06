package Panels;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import Driver.Driver;

public class Instructions extends JPanel {
	JLabel emptyLabel;
	JLabel mpty;
	JLabel space;
	JLabel spac;
	JLabel rule;
	JLabel rul;
	JPanel emptyPanel; 
	Font font;
	JLabel sp;
	JButton goBack;
	public Instructions(final Driver d){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		emptyPanel = new JPanel();
		emptyLabel = new JLabel("INSTRUCTIONS");
		try {
			InputStream myStream = new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Merriweather/Merriweather-Bold.ttf"));
			font = Font.createFont(Font.TRUETYPE_FONT, myStream);
			font = font.deriveFont(16f);
			emptyLabel.setFont(font);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		space = new JLabel(" ");
		mpty = new JLabel("GOAL: Sort all cards in their respected suit and in numerical order in the 5-minute period. ");
		spac = new JLabel(" ");
		rule = new JLabel("HOW-TO-PLAY: The player may transfer the top card or stack of faced up cards to any of the piles in an attempt to create the sequence of descending value and alternating color. An empty spot in the Tableau may be filled with a king.");
		rul = new JLabel("If the player cannot move any cards within the Tableau, 3 cards are selected from the top of the Stock pile to form the Talon. If the first card in the Talon cannot be played, 3 more cards are selected from the Stock. When and if the Stock runs out, the Talon is reshuffled to form a new Stock and the process continues.");
		sp = new JLabel(" ");
		goBack = new JButton("Go Back to Home Screen");
		goBack.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	                d.setOptionSelected(0);
	            }
	    });
		add(emptyLabel);
		add(spac);
		add(mpty);
		add(rule);
		add(rul);
		add(sp);
		add(goBack);
		
		
	}
	 @Override
	    public Dimension getPreferredSize() {
	        return new Dimension(1000, 1000);
	    }
	

}
