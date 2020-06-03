package Panels;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javasolitaire.Deck;


public class TopPanel extends JPanel {

	private JLabel label;
	private JPanel [] cardz;
    private IDeck deck;
    private Game game; 
	public TopPanel(Deck d, Game g){
		game = g; 
		cardz = new JPanel [2];
		
		setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
		
		for (int i =0; i < cardz.length; i++)
		{
			cardz[i] = new JPanel(); 
			
		}
		
        deck = new IDeck(d);
		cardz[0].add(deck);
		
		// Add a mouse listener for the when this panel is clicked
		cardz[0].addMouseListener(new MouseAdapter() {
			
            @Override
            public void mousePressed(MouseEvent e) {
               // When this panel is clicked, we want to draw a card 
               List<ICard> topThree  = new ArrayList<ICard>(); 
               for(int i = 0; i < 3; i++) {
            	   ICard d = deck.drawCard();
            	   if(d != null) {
            		   topThree.add(d);
            	   }
            	   
               }
               
               game.moveCards(topThree);
            	
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            	//System.out.println("Released");
            }
        });
		
		
		cardz[1].add(new JLabel("Solitaire"));
		
		for(int i = 0; i < cardz.length; i++)
		{
			add(cardz[i]);
		}
	}
	public IDeck getIDeck() {
		return deck;
	}
	
}

