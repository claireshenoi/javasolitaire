package Driver;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Driver {

	public static void createAndShowGUI() {
	    //Create and set up the window.
        JFrame frame = new JFrame("FrameDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel pan = new JPanel();
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JPanel name = new JPanel();
        JPanel bigPanel = new JPanel();
        
        pan1.setLayout(new BoxLayout(pan1, BoxLayout.X_AXIS));
        bigPanel.setLayout(new BoxLayout(bigPanel, BoxLayout.Y_AXIS));
        
        // print hello in frame
       
    	Font font;
    	JLabel emptyLabel = new JLabel("Solitaire");
		try {
			InputStream myStream = new BufferedInputStream(new FileInputStream("/Users/claireshenoi/Desktop/javasolitaire/javasolitaire/src/main/resources/Merriweather/Merriweather-Bold.ttf"));
			font = Font.createFont(Font.TRUETYPE_FONT, myStream);
			font = font.deriveFont(24f);
			emptyLabel.setFont(font);
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        //Derive and return a 12 pt version:
        //Need to use float otherwise
        //it would be interpreted as style

        
  
        
       
       
        // create play button
        JButton emptyButton = new JButton("Play Now!");
        JButton emptyButton2 = new JButton("Instructions!");
        
        
        //places play button in frame
        name.add(emptyLabel);
        pan.add(emptyButton);
        pan2.add(emptyButton2);
        
        pan1.add(pan);
        pan1.add(pan2);
        
        
        bigPanel.add(name);
        

        bigPanel.add(pan1);
        
        
        // Add the overall panel to the frame
        frame.add(bigPanel);
        
        
        //frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);        
        //frame.getContentPane().add(emptyButton, BorderLayout.PAGE_END);
        
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });

	}

}
