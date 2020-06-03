package Panels;

	import java.util.List;

import javax.swing.BoxLayout;
	import javax.swing.JLabel;
	import javax.swing.JPanel;



public class MiddlePannel extends JPanel {

		private JLabel label;
		JPanel [] card;
		private IStack stack; 

		public MiddlePannel(){
			//creates panels of cards in a list
			card = new JPanel [8];
			
			// puts the panels in horizontal 
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			
			//creating a new stack
			stack = new IStack();
			
			// adding stack to left most panel
			add(stack);

			//naming and adding the card panels (7) to the middle panel
			
				card[1] = new JPanel(); 
				card[1].add(new JLabel("C 1"));
				add(card[1]);
				
				
				
				card[2] = new JPanel();
				card[2] = new JPanel();
				card[2].add(new JLabel("C 1"));
				card[2].add(new JLabel("C 2"));
				
				card[2].setLayout(new BoxLayout(card[2], BoxLayout.Y_AXIS));
				add(card[2]);
				
				card[3] = new JPanel();
				card[3] = new JPanel();
				card[3] = new JPanel();
				card[3].add(new JLabel("C 1"));
				card[3].add(new JLabel("C 2"));
				card[3].add(new JLabel("C 3"));
				
				card[3].setLayout(new BoxLayout(card[3], BoxLayout.Y_AXIS));
				add(card[3]);
				
				card[4] = new JPanel();
				card[4] = new JPanel();
				card[4] = new JPanel();
				card[4] = new JPanel();
				card[4].add(new JLabel("C 1"));
				card[4].add(new JLabel("C 2"));
				card[4].add(new JLabel("C 3"));
				card[4].add(new JLabel("C 4"));
				
				card[4].setLayout(new BoxLayout(card[4], BoxLayout.Y_AXIS));
				add(card[4]);
				
				card[5] = new JPanel();
				card[5] = new JPanel();
				card[5] = new JPanel();
				card[5] = new JPanel();
				card[5] = new JPanel();
				card[5].add(new JLabel("C 1"));
				card[5].add(new JLabel("C 2"));
				card[5].add(new JLabel("C 3"));
				card[5].add(new JLabel("C 4"));
				card[5].add(new JLabel("C 5"));
				card[5].setLayout(new BoxLayout(card[5], BoxLayout.Y_AXIS));
				add(card[5]);
				
				card[6] = new JPanel();
				card[6] = new JPanel();
				card[6] = new JPanel();
				card[6] = new JPanel();
				card[6] = new JPanel();
				card[6] = new JPanel();
				card[6].add(new JLabel("C 1"));
				card[6].add(new JLabel("C 2"));
				card[6].add(new JLabel("C 3"));
				card[6].add(new JLabel("C 4"));
				card[6].add(new JLabel("C 5"));
				card[6].add(new JLabel("C 6"));
				card[6].setLayout(new BoxLayout(card[6], BoxLayout.Y_AXIS));
				add(card[6]);
		
		}
		
		
		// Init board
		

	    //Add cards to the stack
		public void addCards(List<ICard> cards) {
			stack.addToStack(cards);
			
		}
	}


