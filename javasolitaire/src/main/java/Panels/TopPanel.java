package Panels;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javasolitaire.Deck;
import javasolitaire.SGame;

public class TopPanel extends JPanel {

	private JLabel label;
	JPanel [] cardz;

	public TopPanel(Deck d){
		
		cardz = new JPanel [2];
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		for (int i =0; i < cardz.length; i++)
		{
			cardz[i] = new JPanel(); 
			
		}
		

		cardz[0].add(new IDeck(d));
		cardz[1].add(new JLabel("Solitaire"));
		
		for(int i = 0; i < cardz.length; i++)
		{
			add(cardz[i]);
		}
	}
}

