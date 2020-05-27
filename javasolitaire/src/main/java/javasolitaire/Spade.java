package javasolitaire;

import java.io.BufferedInputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Spade extends Suit {
	public Spade(){
		this.name = "Spade";
		this.isBlack = true; 
		try {
			this.suit = ImageIO.read(new BufferedInputStream(getClass().getClassLoader().getResourceAsStream("download-1.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

}
