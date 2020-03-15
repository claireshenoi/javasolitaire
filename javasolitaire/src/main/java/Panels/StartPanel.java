package Panels;

import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import Driver.Driver;

public class StartPanel extends JPanel {
	JPanel pan;
    JPanel pan1;
    JPanel pan2;
    JPanel name;
    JPanel bigPanel;
    Font font; 
    JLabel emptyLabel; 
    static JButton emptyButton;
    static JButton emptyButton2;
    
    
    public StartPanel(final Driver d){
    	pan = new JPanel();
        pan1 = new JPanel();
        pan2 = new JPanel();
        name = new JPanel();
        bigPanel = new JPanel();
    
	    pan1.setLayout(new BoxLayout(pan1, BoxLayout.X_AXIS));
	    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
	    
	    // print hello in frame
	    emptyLabel = new JLabel("Solitaire");
		try {
			InputStream myStream = new BufferedInputStream(new FileInputStream("/Users/claireshenoi/Desktop/javasolitaire/javasolitaire/src/main/resources/Merriweather/Merriweather-Bold.ttf"));
			font = Font.createFont(Font.TRUETYPE_FONT, myStream);
			font = font.deriveFont(24f);
			emptyLabel.setFont(font);
		} catch (FontFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
	    // create play button
	    emptyButton = new JButton("Play Now!");
	    
	    emptyButton2 = new JButton("Instructions!");
	    emptyButton.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	                d.setOptionSelected(2);
	            }
	    });
      	emptyButton2.addActionListener(new ActionListener() {
	    	 public void actionPerformed(ActionEvent e) {
	    		   d.setOptionSelected(1);
	            }
	    });
	    
	    
	    
	    //places play button in frame
	    name.add(emptyLabel);
	    pan.add(emptyButton);
	    pan2.add(emptyButton2);
	    
	    pan1.add(pan);
	    pan1.add(pan2);
	    
        add(name);
        

        add(pan1);
        
    }
    

    

}
