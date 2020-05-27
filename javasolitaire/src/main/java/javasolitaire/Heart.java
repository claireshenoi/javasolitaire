package javasolitaire;

import java.io.BufferedInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Heart extends Suit {
   public Heart(){
	    this.name = "Heart";
	    this.isBlack = false; 
		try {
			this.suit = ImageIO.read(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("1200px-Card_heart.svg.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
   }
}
