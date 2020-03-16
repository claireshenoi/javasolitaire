//Claire :) game layout
package Panels;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

import javasolitaire.Card;
import javasolitaire.Diamond;
import javasolitaire.SGame;

public class Game extends JPanel {
	private SGame g;
	private JPanel d;
	JPanel panel1; 
	JPanel panel2;
	JPanel panel3; 
	JPanel panel4;
	JLabel first;
	JLabel second;
	ICard c; 
	public Game(){
		g = new SGame();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		first = new JLabel("Panel 1");
		second = new JLabel("Panel 2");
		c = new ICard(new Card("King", new Diamond()));
		panel2.add(first);
		panel3.add(second);
		panel4.add(c);
		add(panel2);
		add(panel3);
		add(panel4);
			
	}
}
