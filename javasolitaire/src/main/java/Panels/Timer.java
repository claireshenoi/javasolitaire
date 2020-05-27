package Panels;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Driver.Driver;
import javasolitaire.SGame;
public class Timer extends JPanel {

	private JLabel label;
	JPanel [] times;

	public Timer(final Driver b){
		
		times = new JPanel [2];
		
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		
		for (int i =0; i < times.length; i++)
		{
			times[i] = new JPanel(); 
			
		}

		times[0].add(new Countdown());
		
		JButton goBck = new JButton("Go Back to Home Screen");
		goBck.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	                b.setOptionSelected(0);
	            }

		});
		times[1].add(goBck);
		
		for(int i = 0; i < times.length; i++)
		{
			add(times[i]);
		}
	}
}

