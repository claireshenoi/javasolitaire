package javasolitaire;

import java.io.BufferedInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Diamond extends Suit {
	public Diamond(){
		this.name = "Diamond";
		this.isBlack = false; 
		try {
			this.suit = ImageIO.read(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("Card_diamond.svg.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	

}
