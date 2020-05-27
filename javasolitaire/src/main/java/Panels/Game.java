//Claire Shenoi game layout
package Panels;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import Driver.Driver;
import javasolitaire.Card;
import javasolitaire.Diamond;
import javasolitaire.SGame;

public class Game extends JPanel {
	private SGame g;
	private JPanel d;
	private JButton goBck;
	private Timer timer;
	private long startTime = -1;
	private long duration = 5000;
	
	private JLabel label;
	JPanel [] panels;

	public Game(final Driver b){
		g = new SGame();
		panels = new JPanel [3];
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panels[0] = new TopPanel(g.getDeck());
		panels[1] = new MiddlePannel();
		panels[2] = new BottomPanel(b);
		
		
		
	
		
		ICard c = new ICard(new Card("2",new Diamond()));
		c.toggleVisible(true);
		

		
		for(int i = 0; i < panels.length; i++)
		{
				add(panels[i]);
		}
		
					
			
		
		}
	 @Override
	    public Dimension getPreferredSize() {
	        return new Dimension(1000, 1000);
	    }
	
}
