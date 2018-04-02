package GUI;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Cornice extends JFrame {
    LinkedList<BufferedImage> al=new LinkedList<BufferedImage>();
    
	
   
	public Cornice() {
		for (int i = 1; i < 9; i++) {
			try {
				al.addLast(ImageIO.read(this.getClass().getResource("hero_run000" + i + ".png")));
			} catch (IOException e) {
			}
		}
		Pannello p = new Pannello(al);
		 Controllore c=new Controllore(p,al);
		
		this.setTitle("FlipperMan v1.0");
		this.setSize(800, 800);
		this.setLocation(960, 540);
		p.setVisible(true);
		this.add(p);
		new Thread(c).start();
	}
}
