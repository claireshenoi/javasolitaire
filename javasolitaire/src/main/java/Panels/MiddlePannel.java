package Panels;

	import javax.swing.BoxLayout;
	import javax.swing.JLabel;
	import javax.swing.JPanel;

	import javasolitaire.SGame;

public class MiddlePannel extends JPanel {

		private JLabel label;
		JPanel [] card;

		public MiddlePannel(){
			
			card = new JPanel [8];
			
			setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
			
			for (int i =0; i < card.length; i++)
			{
				card[i] = new JPanel(); 
				card[i].add(new JLabel("Panel" + i));
				add(card[i]);
			}
			
		}
	}


