package javasolitaire;

import java.util.ArrayList;
import java.util.List;

import Driver.Driver;

public class SGame {
	private Deck d; 
	
	public SGame(){
		d = new Deck(); 
		List<Card> test = d.getDeck();
		
	}
	public Deck getDeck() { return d; }
	void initGame(){
		List<List<Card>> h = new ArrayList(); 
		for (int i = 0; i< 8; i++) {
			List<Card> t = new ArrayList();
			for (int y = 0; y < i; y++) {
				Card c = d.getTop();
				t.add(c);
			}
			h.add(t);
		}
		for(int i =0; i <h.size(); i++) {
			for(int y =0; y < h.get(i).size();y++) {
				if(y + 1 == h.get(i).size()) {
					h.get(i).get(y).setIsFaceUp(true);
				}
				System.out.print(h.get(i).get(y));
			}
			System.out.println();
		}
	
	}
	 public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	       SGame s = new SGame();
	       s.initGame();
	       
	       

		}
	

}
