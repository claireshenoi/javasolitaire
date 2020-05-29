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
import java.util.List;

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
import javasolitaire.Deck;
import javasolitaire.Diamond;


public class Game extends JPanel {

	private JPanel d;
	private JButton goBck;
	private Timer timer;
	private long startTime = -1;
	private long duration = 5000;
	
	private JLabel label;
	TopPanel top; 
	MiddlePannel mid; 
	BottomPanel bot; 

	public Game(final Driver b){
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		top = new TopPanel(new Deck(),this);
		mid = new MiddlePannel();
		bot = new BottomPanel(b);
		
		ICard c = new ICard(new Card("2",new Diamond()));
		c.toggleVisible(true);
	
		
		//Add to the main panel
		add(top);
		add(mid);
		add(bot);
		
	}

	public void moveCards(List<ICard> cards) {
		
	    mid.addCards(cards);
	}
	 @Override
    public Dimension getPreferredSize() {
        return new Dimension(1000, 1000);
    }
	
}
