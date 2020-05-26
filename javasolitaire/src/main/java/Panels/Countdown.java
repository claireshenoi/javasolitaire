package Panels;

import java.awt.Dimension;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.SimpleDateFormat;

import javax.swing.Timer;
import javax.swing.JLabel;
import javax.swing.JPanel;
//Adapted from: https://stackoverflow.com/questions/28337718/java-swing-timer-countdown
public class Countdown extends JPanel{
	private Timer timer;
    private long startTime = -1;
    private long duration; 

    private JLabel label;

    public Countdown() {
    	// set 5 minutes on the clock
    	duration = 5 * 60 * 1000; 
        setLayout(new GridBagLayout());
        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (startTime < 0) {
                    startTime = System.currentTimeMillis();
                }
                long now = System.currentTimeMillis();
                long clockTime = now - startTime;
                if (clockTime >= duration) {
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
                if (!timer.isRunning()) {
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
        return new Dimension(200, 200);
    }
}
