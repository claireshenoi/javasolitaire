package Panels;

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
    	if(stack.size() == 0)
    	{
    		JPanel empty = new JPanel();
    		add(empty);
    	}
    	if(stack.size() != 0)
    	{
    	JPanel cardOne = new JPanel();
    	cardOne.add(stack.get(0));
    	JPanel cardTwo = new JPanel();
    	cardTwo.add(stack.get(1));
    	JPanel cardThree = new JPanel();
    	cardThree.add(stack.get(2));
    	add(cardOne);
        add(cardTwo);
        add(cardThree);
    	}
    }
  

	public void addToStack(List<ICard>deck)
    {
    	for(int i = 0; i < deck.size(); i++)
    	{
    		stack.add(deck.get(i));
    	}
    	
    }
    public List <ICard> goBackToDeck(){
		return null;
    	
    }
    public ICard removeFromStack()
    {
		return stack.remove(0);
    	
    }
    
    
    
    
    
    
}
