package javasolitaire;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;



public class Suits extends JPanel {
	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	public Suits() {
		// TODO Auto-generated constructor stub
	}
	
	public Suits(BufferedImage image) {
	      this.image = image;
	}

   public BufferedImage getImage() {
      return image;
   }

   public void paint(Graphics g) {
      g.drawImage(image, 0, 0, this);
   }

   public void loadOriginalImage(File file) {
      try {
         image = ImageIO.read(file);
      } catch (IOException e) {
         e.printStackTrace();
      }
   }

}
