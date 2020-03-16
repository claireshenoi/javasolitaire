package Panels;

import javax.swing.BoxLayout;
import javax.swing.JPanel;

import javasolitaire.SGame;

public class Game extends JPanel {
	private SGame g;
	private JPanel d, panel1, panel2, panel3; 
	public Game(){
		g = new SGame();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panel1 = new JPanel();

	
		
		 
	}
}
