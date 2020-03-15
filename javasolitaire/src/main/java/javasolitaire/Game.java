package javasolitaire;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Point;
import java.util.Scanner;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
public class Game extends JPanel{
	private Deck d;
	private Hand [] players; 
	private int numPlay; 
	private boolean called; 
	private int turn; 
	private Scanner myObj;
	private Card top; 
	
	private final JSplitPane splitPane;  // split the window in top and bottom
   
    
    private final JSplitPane sp1;
    
    
    
	public Game() {
		this(2);    
	}
	public Game(int play) {
		super(new BorderLayout());
		
		 myObj = new Scanner(System.in);
		// Create a deck
		d = new Deck(); 
	    d.shuffle(); 
	    
	    top = d.getTop(); 
	    called = false; 
	    turn = 0; 
	    
	    numPlay = play;
	    
		splitPane = new JSplitPane();
      
       
        sp1 = new JSplitPane();

        // in our bottom panel we want the text area and the input components
       
        this.players = new Hand [this.numPlay];
		//Give each player 5 cards 
		for(int y = 0; y <this.numPlay;y++) {
			Hand h =  new Hand();
			for(int i =0; i < 5; i ++) {
				Card c = d.getTop(); 
				h.addCard(c);
			}
			this.players[y] = h; 
		}

       
        
        // due to the GridLayout, our splitPane will now fill the whole window

        // let's configure our splitPane:
        splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);  // we want it to split the window verticaly
        
        splitPane.setDividerLocation(400);                    // the initial position of the divider is 200 (our window is 400 pixels high)
        // at the top we want our "topPanel"
        sp1.setOrientation(JSplitPane.HORIZONTAL_SPLIT);
        sp1.setDividerLocation(400);
        splitPane.setTopComponent(sp1);
        splitPane.setBottomComponent(players[0]);            // and at the bottom we want our "bottomPanel"
        sp1.setTopComponent(top);
        sp1.setBottomComponent(d);
        
    

       
        
        add(splitPane,BorderLayout.CENTER);
        
        
        
	    
	   

	}
	
	public void runGame() {
		
		this.turn = 0; 
		int [] scores = new int [this.numPlay];
		while(!called) {
			for(int i = 0;i < numPlay && !called; i++) {
				System.out.println("-------Player " + i + " turn ------");
				System.out.print("Top Card: "); 
				top.printCard(); 
				
				System.out.println("\nPlayer Hand:");
				players[i].printHand(); 
				int ndx;
				
				
				
                if(this.turn > 2) {
                	System.out.println("1) Play card OR 2) Call Yousef");
                	String n = myObj.nextLine();
                	if(n.equals("2")) {
                		called = true; 
                	}
				}
                
                if(!called) {
                	System.out.println("Play card");
					String n = myObj.nextLine();
					Card c = this.top; 
					
						
					//TODO: Add in validation (might not need to do it if graphics are there though
					int [] arr = new int [5];
					int p = 0; 
					for(int y =0; y < n.length();y++) {
						 arr[p] = n.charAt(y) - '0';
						 p++;
					}
					
					//Check to make sure this is a valid move
					while(!this.players[i].checkPlay(arr, p)){
						System.out.println("Invalid move. Please try again");
						n = myObj.nextLine();
						p = 0; 
						for(int y =0; y < n.length();y++) {
							 arr[p] = n.charAt(y) - '0';
							 p++;
						}
					}
					c = this.players[i].removeCards(arr,p);
						
					System.out.println("Pick from \n 1) Deck \n 2) Top Card");
					n = myObj.nextLine();
					ndx = n.charAt(0) - '0';
					if(ndx > 1) {
						this.players[i].addCard(this.top);
					}else {
						this.players[i].addCard(d.getTop());
					}
					this.top = c; 
					players[i].printHand(); 
                }else {
                	int playCall = this.players[i].sumHand();
                	boolean isLowest = true;
                	
                	for(int y = 0;y < numPlay ; y++) {
                		int s = this.players[y].sumHand();
                		if(s< playCall) {
                			isLowest = false; 
                		}
                		scores[y] = s;
                	}
                	
                	if(isLowest) {
                	   for(int y = 0; y < this.numPlay; y++) {
                		   if(y != i) {
                			   scores[y] = 0; 
                		   }else {
                			   scores[y] = 30; 
                		   }
                	   }
                	}else {
                		scores[i] = 0; 
                	}
                }
	
			}
			this.turn++; 
		
		}
		
		for(int i = 0; i < this.numPlay;i++) {
			System.out.println("Player " + i + " Score: " + scores[i]);
		}

	}


}
