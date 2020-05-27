package javasolitaire;

import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;


public class Suit {
	BufferedImage suit;
	String name; 
	boolean isBlack; 
	
    public Suit(){
    
    	
    }

	public BufferedImage getSuit() {
		return suit;
	}

	public void setSuit(BufferedImage suit) {
		this.suit = suit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isBlack() {
		return isBlack;
	}

	public void setBlack(boolean isBlack) {
		this.isBlack = isBlack;
	}

	@Override
	public String toString() {
		return "Suit [name=" + name + "]";
	}
    
	   
}
