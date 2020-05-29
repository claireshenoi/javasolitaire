package Panels;

import java.awt.Component;
import java.util.List;
import java.util.Stack;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class IStack extends JPanel{
 
	// fields  
	Stack<ICard> stack; 
	
	
	//constructor 
    public IStack(){
    	setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    	stack = new Stack<ICard>();
    	showTopThreeCards();
    	
    	
    }
    
    public void showTopThreeCards()
    {
    	// Need to repaint the top three cards 
    	Component[] componentList = this.getComponents();

		//Loop through the components
		for(Component c : componentList){

		    //Find the components you want to remove
		    if(c instanceof JPanel){

		        //Remove it
		        this.remove(c);
		    }
		}
    	if(stack.size() == 0)
    	{
    		JPanel empty = new JPanel();
    		add(empty);
    	}
    	if(stack.size() != 0)
    	{
	    	JPanel cardOne = new JPanel();
	    	cardOne.add(stack.peek());
	    	/*JPanel cardTwo = new JPanel();
	    	cardTwo.add(stack.get(1));
	    	JPanel cardThree = new JPanel();
	    	cardThree.add(stack.get(2));*/
	    	add(cardOne);
	        //add(cardTwo);
	        //add(cardThree);
    	}
    	this.revalidate();
		this.repaint();
    }
  

	public void addToStack(List<ICard>deck)
    {
		
    	for(int i = 0; i < deck.size(); i++)
    	{
    		deck.get(i).toggleVisible(true);
    		stack.add(deck.get(i));
    	}
    	showTopThreeCards();
    	
    	
		
		

    	
    }
    public List <ICard> goBackToDeck(){
		return null;
    	
    }
    public ICard removeFromStack()
    {
		return stack.remove(0);
    	
    }
    
    
    
    
    
    
}
