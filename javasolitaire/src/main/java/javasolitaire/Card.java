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

enum Suit {
	
	SPADE, CLUB, HEART, DIAMOND;
	
}
public class Card extends JPanel{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//Data Abstraction 
	String num; 
	int value; 
	Suit s; 
	int order; 
	
	public Card() {}
	public Card(int v){
	   	this.value = v;
	}
	public Card(String n, int v, Suit q, int o){
		this.num = n; 
		this.value = v; 
		this.s = q; 
		if(o <1) {
			this.order = this.value; 
		}else {
			this.order = o; 
		}
	}
	
    /*Getters and Setters */ 
	public int getOrder() {
		return this.order; 
	}
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Suit getS() {
		return s;
	}
	public void setS(Suit s) {
		this.s = s;
	}
	
	public boolean isGreater(Card q) {
		boolean isG = false; 
		if(q.value > this.value) {
			isG = true; 
		}
		return isG;
	}
	public void printCard() {
		System.out.print(this.num + " ");
		String res = "";
		switch(this.s) {
		    case DIAMOND:  res = "DIAMOND"; break; 
		    case CLUB:  res = "CLUB"; break;
		    case HEART:  res = "HEART"; break;
		    case SPADE:  res = "SPADE"; break;
		}
		System.out.println(res + " ");
	}
	public void paintComponent(Graphics g) {
        super.paintComponent(g);

        var center = new Point(getWidth() / 2 , getHeight() / 2 );
        var radius = Math.min(getWidth() / 2, getHeight() / 2) - 5;
       
        var innerRadius = (int)(radius * 0.9);
        var barWidth = (int)(innerRadius * 1.4);
        var barHeight = (int)(innerRadius * 2);

        g.setColor(Color.WHITE);
        
        g.fillRect(center.x - barWidth/2 , center.y - barHeight/2 , barWidth, barHeight);
        g.setColor(Color.BLACK);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 15)); 
        g.drawString( this.num ,center.x - barWidth/3,center.y - barHeight/3 );
        g.drawString( this.num ,center.x + barWidth/3,center.y + barHeight/3 );
    }

	
	// This function compares two cards
	public boolean equals(Card q) {
		boolean b = false; 
		if(q.num == this.num && q.value == this.value && q.s == this.s) {
			b = true; 
		}
		return b; 
		
	}

}
