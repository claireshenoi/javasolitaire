package Panels;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Driver.Driver;
import javasolitaire.Card;
import javasolitaire.Club;
import javasolitaire.Diamond;
import javasolitaire.Heart;

import javasolitaire.Spade;
import javasolitaire.Suit;

public class BottomPanel extends JPanel {

	private JLabel label;
	JPanel [] cards;

	public BottomPanel(final Driver d){
		
		cards = new JPanel [5];
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		for (int i =0; i < cards.length-1; i++)
		{
			cards[i] = new JPanel();
			if(i == 0)
			{
				//cards[i].add(new JLabel("Hearts"));
				Card hearts = new Card (" ", new Heart());
				hearts.setIsFaceUp(true);
				cards[i].add(new ICard(hearts));
			}
			if(i == 1)
			{
				//cards[i].add(new JLabel("Diamonds"));
				Card diamonds = new Card (" ", new Diamond());
		        diamonds.setIsFaceUp(true);
				cards[i].add(new ICard(diamonds));
			}
			if(i == 2)
			{
				//cards[i].add(new JLabel("Clubs"));
				Card clubs = new Card (" ", new Club());
				clubs.setIsFaceUp(true);
				cards[i].add(new ICard(clubs));
			}
			if(i == 3)
			{
				//cards[i].add(new JLabel("Spades"));
				Card spades = new Card (" ", new Spade());
				spades.setIsFaceUp(true);
				cards[i].add(new ICard(spades));
			}
			add(cards[i]);
		
		}
		cards[4] = new Timer(d); 
		
		add(cards[4]);
		System.out.println("Panel 3");
		
		
	}
}
