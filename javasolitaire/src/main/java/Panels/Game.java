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
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.Timer;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


import javasolitaire.Card;
import javasolitaire.Diamond;
import javasolitaire.SGame;

public class Game extends JPanel {
	private SGame g;
	private JPanel d;
	private Timer timer;
	private long startTime = -1;
	private long duration = 5000;
	
	private JLabel label;
	
	JPanel panel1; 
	JPanel panel2;
	JPanel panel3; 
	JPanel panel4;
	JLabel first;
	JLabel second;
	JLabel third; 
	public Game(){
		g = new SGame();
		setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		panel1 = new JPanel();
		panel2 = new JPanel();
		panel3 = new JPanel();
		panel4 = new JPanel();
		first = new JLabel("Panel 1");
		second = new JLabel("Panel 2");
		third = new JLabel("Time");
		
		panel4.setLayout(new GridBagLayout());
		timer = new Timer(10, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if(startTime < 0) {
					startTime = System.currentTimeMillis();
				}
				long now = System.currentTimeMillis();
				long clockTime = now - startTime;
				if(clockTime >= duration) {
					clockTime = duration;
					timer.stop();
				}
				SimpleDateFormat df = new SimpleDateFormat("mm:ss:SSS");
				label.setText(df.format(duration - clockTime));
			}
			
		});
		timer.setInitialDelay(0);
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!timer.isRunning()) {
					startTime = -1;
					timer.start();
				}
			}
			 
		});
		label = new JLabel("...");
		add(label);
	}
		@Override
		public Dimension getPreferredSize() {
			return new Dimension(200,200);
		}
	

panel2.add(first);
panel3.add(second);
panel4.add(third);
add(panel2);
add(panel3);
add(panel4);
			
	

}
}
