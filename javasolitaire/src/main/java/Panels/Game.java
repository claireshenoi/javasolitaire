//Claire :) game layout
package Panels;

import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;

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
	JLabel third;
	public Game(){
		g = new SGame();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		first = new JLabel("Panel 1");
		second = new JLabel("Panel 2");
		third = new JLabel("Panel 3");
		panel2.add(first);
		panel3.add(second);
		panel4.add(third);
		add(panel2);
		add(panel3);
		add(panel4);
			
		 
	}
}
