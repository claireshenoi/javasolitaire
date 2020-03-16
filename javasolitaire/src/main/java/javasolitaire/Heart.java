package javasolitaire;

import java.io.BufferedInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Heart extends Suit {
   Heart(){
	    this.name = "Heart";
	    this.isBlack = false; 
		try {
			this.suit = ImageIO.read(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Card_heart.svg")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
   }
}
