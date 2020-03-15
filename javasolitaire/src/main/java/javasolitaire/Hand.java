package javasolitaire;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;

import javax.swing.JPanel;

public class Hand extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	int HAND_SIZE = 5; 
	Card [] deck; 
	int num;
	int pos; 
	
	
	public Hand() {
		deck = new Card[HAND_SIZE];
		num = HAND_SIZE;
		pos = 0; 
		GridLayout a = new GridLayout(1,5);
		this.setLayout(a);
		
		
	}
	
	public void addCard(Card c) {
		deck[pos] = c; 
		pos++; 
	}
	
	public Card removeCard(int ndx) {
		Card r = this.deck[ndx];
		for(int i = ndx; i < this.pos -1;i++) {
			this.deck[i] = this.deck[i+1];
		}
		this.pos--; 
		return r; 	
		
	}
	protected boolean checkPlay(int [] arr, int size) {
		boolean valid = true; 
		//Check to see if the numbers are valid 
		for(int i = 0; i < size; i++) {
			if(arr[i] > this.pos - 1) {
				valid = false; 
			}
		}
		
		
		if(size > 1 && valid) {
			//Case 1: Same number 
			String n = this.deck[arr[0]].getNum();
			boolean sameNum = true; 
			for(int i =0; i < size; i++) {
				if(!this.deck[arr[i]].getNum().equals(n)) {
					sameNum = false; 
				}
			}
		
			//Case 2: 3 in a row same suit
			boolean row = true; 
			//Order cards in increasing order
			for(int i =0; i < size;i++) {
				for(int y = 0; y < size -1; y++) {
					if(this.deck[arr[y]].isGreater(this.deck[arr[y+1]])) {
						int t = arr[y];
						arr[y] = arr[y+1]; 
						arr[y+1] = t; 
					}
					
				}
			}
			
			//TODO: ensure that this works properly 
			if(size > 3) {
				for(int i = 0; i < size - 1 && row; i++) {
					if(this.deck[arr[i]].getOrder() +1 != this.deck[arr[i+1]].getOrder()) {
						row = false; 
					}
				}
			}else if(size > 2) {
				Suit s = this.deck[arr[0]].getS();
				for(int i = 0; i < size - 1 && row; i++) {
					if(this.deck[arr[i]].getOrder() +1 != this.deck[arr[i+1]].getOrder() || s !=this.deck[arr[i]].getS() ) {
						row = false; 
					}
				}
				
			}
			
			if(sameNum || row) {
				valid = true; 
			}
		}
		
		return valid; 
	}
	public Card removeCards(int [] arr, int size) {
		
		Card highest = this.deck[arr[0]]; 
		if(size > 1) {
		   	 for(int i = 1; i < size; i++) {
		   		 int ndx = arr[i];
		   		 if(this.deck[ndx].isGreater(highest)) {
		   			 highest = this.deck[ndx];
		   		 }
		   	 }
		   	 
		   	 //Get the largest indexes
		   	 for(int i = 0; i < size; i++) {
		   		 for(int y = 0; y < size-1; y++) {
		   			 if(arr[y] < arr[y+1]) {
		   				 int t  = arr[y];
		   				 arr[y] = arr[y+1];
		   				 arr[y+1] = t; 
		   			 }
		   		 }
		   	 }
		   	 for(int i = 0; i < size; i++) {
		   		 this.removeCard(arr[i]);
		   		 
		   	 }
		  
		}else {
			highest = removeCard(arr[0]);
		}
		
		return highest; 
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		for(int i = 0; i < num; i++) {
			this.add(deck[i]);
		}
		/*var center = new Point(getWidth() / 2 , getHeight() / 2 );
        var radius = Math.min(getWidth() / 2, getHeight() / 2) - 5;
       
        var innerRadius = (int)(radius * 0.9);
        var barWidth = (int)(innerRadius * 1.4);
        var barHeight = (int)(innerRadius * 2);

        g.setColor(Color.WHITE);
        
        g.fillRect(center.x - barWidth/2 , center.y - barHeight/2 , barWidth, barHeight);
        g.setColor(Color.BLACK);
*/
      

    
 
       
    }
	
	public int sumHand() {
		int s = 0 ; 
		for(int i = 0;i < num; i++) {
			s += deck[i].getValue();
		}
		return s; 
	}
	public void printHand() {
		for(int i = 0; i < this.pos; i ++) {
			System.out.print(i+": ");
			deck[i].printCard(); 
		}
	}

}
