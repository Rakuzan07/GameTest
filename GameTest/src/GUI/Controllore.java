package GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Controllore implements Runnable {

	
	LinkedList<BufferedImage> al;
	JPanel pannello;

	public Controllore(JPanel pannello) {
		al = new LinkedList<>();
		this.pannello = pannello;
		for (int i = 1; i < 9; i++) {
			try {
				al.addLast(ImageIO.read(this.getClass().getResource("hero_run000" + i + ".png")));
			} catch (IOException e) {
			}
		}
	}

	public Controllore(JPanel pannello ,LinkedList<BufferedImage> al) {
		
		this.pannello=pannello;
		this.al = al;
	}

	public void run() {
		int index = 0;
		while (true) {
			try {
				//g.drawImage(al.getFirst(), al.get(0).getWidth() * index, 0, pannello);
				pannello.repaint();
				BufferedImage img=al.removeFirst();
				al.addLast(img);
				index = (index + 1) % al.size();
				TimeUnit.MILLISECONDS.sleep(50);
			} catch (InterruptedException e) {
			}
		}

	}

}
