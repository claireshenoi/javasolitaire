package Panels;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javasolitaire.SGame;

public class BottomPanel extends JPanel {

	private JLabel label;
	JPanel [] cards;

	public BottomPanel(){
		
		cards = new JPanel [5];
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		for (int i =0; i < cards.length-1; i++)
		{
			cards[i] = new JPanel(); 
			cards[i].add(new JLabel("Panel" + i));
			add(cards[i]);
		}
		cards[4] = new Timer(); 
		
		add(cards[4]);
		System.out.println("Panel 3");
	}
}
