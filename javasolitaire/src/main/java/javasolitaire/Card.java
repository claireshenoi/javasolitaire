package javasolitaire;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;
import javax.swing.SwingUtilities;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Card {
	//Data Abstraction 
	String num; 
	Suit s;
	boolean isFaceUp; 
	
	
	public Card() {
		//Creates a blank card
	}
	public Card(String n, Suit s){
		this.num = n; 
		this.s = s; 
		this.isFaceUp = false; 
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	public Suit getS() {
		return s;
	}
	public void setS(Suit s) {
		this.s = s;
	}
	
	public boolean getIsFaceUp() {
		return isFaceUp;
	}
	public void setIsFaceUp(boolean s) {
		this.isFaceUp = s;
	}

	@Override
	public String toString() {
		String str = "Card [num=" + num +  ", s=" + s + "]";
		if (!isFaceUp) {
			str = "[****]";
		}
		return str;
	} 
	
	
	
	

}
