package Panels;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

import javasolitaire.SGame;
public class Timer extends JPanel {

	private JLabel label;
	JPanel [] times;

	public Timer(){
		
		times = new JPanel [2];
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for (int i =0; i < times.length; i++)
		{
			times[i] = new JPanel(); 
			
		}

		times[0].add(new Countdown());
		times[1].add(new JLabel("Main Menu"));
		
		for(int i = 0; i < times.length; i++)
		{
			add(times[i]);
		}
	}
}

