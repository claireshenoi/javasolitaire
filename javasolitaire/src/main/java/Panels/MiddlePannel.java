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
			
			card = new JPanel [8];
			
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			
			stack = new IStack();
			add(stack);
			
			for (int i =1; i < card.length; i++)
			{
				card[i] = new JPanel(); 
				card[i].add(new JLabel("Panel" + i));
				add(card[i]);
				
			}
			
		}

		public void addCards(List<ICard> cards) {
			stack.addToStack(cards);
			
		}
	}


