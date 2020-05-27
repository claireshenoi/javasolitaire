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
import javax.swing.SwingUtilities;

import Panels.*;
import javasolitaire.*;

public class Driver {
	
	private static int optionSelected; 
	static JPanel startPage; 
	static JPanel instructions; 
	static JPanel game;
	static JFrame frame; 
	public Driver(){
		//Set the option selected to be 
		optionSelected = 0; 
		startPage = new StartPanel(this); 
		instructions = new Instructions(this);
		game = new Game(this); 
		
		
	}
	
	public void setOptionSelected(int a) {
		int old = this.optionSelected;
		optionSelected = a; 
		frame.setVisible(false);
		createAndShowGUI(a);
		
		
		
	}
	
	private static void addPanel(int opt) {
		switch(opt) {
		case 0: frame.add(startPage); break;
		case 1: frame.add(instructions); break; 
		case 2: frame.add(game); break; 
		}
	}


	public static void createAndShowGUI(int opt) {
	    //Create and set up the window.
        frame = new JFrame("Solitaire");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        addPanel(opt);
        
     
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
 
    public static void main(String[] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	Driver d = new Driver(); 
                d.createAndShowGUI(0);
            }
        });

	}

}
