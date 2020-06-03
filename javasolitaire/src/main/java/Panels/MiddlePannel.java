package Panels;

	import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.List;

import javax.swing.BoxLayout;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

import javasolitaire.Deck;



public class MiddlePannel extends JPanel {

		private JLabel label;
		JPanel [] card;
		private final int numPanels = 8; 
		private IStack stack; 

		public MiddlePannel(){
			//creates panels of cards in a list
			card = new JPanel [numPanels];
			
			// puts the panels in horizontal 
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			
			//creating a new stack
			stack = new IStack();
			
			// adding stack to left most panel
			add(stack);

			//naming and adding the card panels (7) to the middle panel
		
		}
		
		
		// Init board
		public void initBoard(IDeck d) {
			int num = 0; 
			for(int i = 1; i < numPanels; i++)
			{
				card[i] = new JPanel();
				card[i].setLayout(new BoxLayout(card[i], BoxLayout.Y_AXIS));
				for(int j = 0; j<i; j++)
				{
					num ++; 
					final ICard s = d.drawCard();
					if(j == i -1) {
						s.toggleVisible(true);
						s.addMouseMotionListener(new MouseMotionListener() {

							public void mouseDragged(MouseEvent e) {
								// TODO Auto-generated method stub
								int mouseX = e.getX();
						        int mouseY = e.getY();
						        s.setBounds(mouseX, mouseY, 100, 50);
								System.out.println("Moved");
								
								
							}

							public void mouseMoved(MouseEvent e) {
								// TODO Auto-generated method stub
								//System.out.println("Moved");
								
								
								
								
							}

						
							
						});
					}
					
					card[i].add(s);
					
				}	
				add(card[i]);
			}
			System.out.println("Number cards: " + num);
		}
		

	    //Add cards to the stack
		public void addCards(List<ICard> cards) {
			stack.addToStack(cards);
			
		}
	}


