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
			
				
				for(int i = 1; i < card.length; i++)
				{
					for(int j = 0; j<i; j++)
					{
						card[j] = new JPanel();
						card[j].add(new JLabel("Card " + j));
						card[j].setLayout(new BoxLayout(card[i], BoxLayout.Y_AXIS));
					}
					
					add(card[i]);
				}
					
			
		
		}

	    //Add cards to the stack
		public void addCards(List<ICard> cards) {
			stack.addToStack(cards);
			
		}
	}


