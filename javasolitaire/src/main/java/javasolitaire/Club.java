package javasolitaire;

import java.io.BufferedInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Club extends Suit {
	
	public Club(){
		this.name = "Club";
		this.isBlack = true; 
		try {
			this.suit = ImageIO.read(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("download.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
